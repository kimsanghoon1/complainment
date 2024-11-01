package complainment.domain;

import complainment.ReceiptApplication;
import complainment.domain.ComplaintReceived;
import complainment.external.Fee;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "Complainment_table")
@Data
//<<< DDD / Aggregate Root
public class Complainment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String complainId;

    private String userId;

    @Embedded
    private ComplainmentDetail complainDetail;

    @PostPersist
    public void onPostPersist() {
        ComplaintReceived complaintReceived = new ComplaintReceived(this);
        complaintReceived.publishAfterCommit();

        Fee fee = new Fee();
        fee.setComplainId(complainId);
        fee.setCharge(500L);
        ReceiptApplication.applicationContext
        .getBean(complainment.external.FeeService.class)
        .pay(complainId, fee);

    }

    public static ComplainmentRepository repository() {
        ComplainmentRepository complainmentRepository = ReceiptApplication.applicationContext.getBean(
            ComplainmentRepository.class
        );
        return complainmentRepository;
    }

    //<<< Clean Arch / Port Method
    public static void applyFail(PaymentFail paymentFail) {
        //implement business logic here:

        /** Example 1:  new item 
        Complainment complainment = new Complainment();
        repository().save(complainment);

        */

        /** Example 2:  finding and process
        
        repository().findById(결재실패.get???()).ifPresent(complainment->{
            
            complainment // do something
            repository().save(complainment);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
