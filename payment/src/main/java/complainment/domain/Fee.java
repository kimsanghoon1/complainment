package complainment.domain;

import complainment.PaymentApplication;
import complainment.domain.PaymentSuccess;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "Fee_table")
@Data
//<<< DDD / Aggregate Root
public class Fee {

    @Id
    private Long id;

    private String complainId;
    private Long charge;

    @PostPersist
    public void onPostPersist() {
        /**
         *  결재완료됨 결재완료됨 = new 결재완료됨(this);
        결재완료됨.publishAfterCommit();

        PaymentFailed 결재실패 = new PaymentFailed(this);
        결재실패.publishAfterCommit(); 
        **/
    }

    public static FeeRepository repository() {
        FeeRepository feeRepository = PaymentApplication.applicationContext.getBean(
            FeeRepository.class
        );
        return feeRepository;
    }

    //<<< Clean Arch / Port Method
    public static void applyPayment(ComplaintReceived complaintReceived) {
        //implement business logic here:

        /** Example 1:  new item 
        Fee fee = new Fee();
        repository().save(fee);

        결재실패 결재실패 = new 결재실패(fee);
        결재실패.publishAfterCommit();
        결재완료됨 결재완료됨 = new 결재완료됨(fee);
        결재완료됨.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(complaintReceived.get???()).ifPresent(fee->{
            
            fee // do something
            repository().save(fee);

            결재실패 결재실패 = new 결재실패(fee);
            결재실패.publishAfterCommit();
            결재완료됨 결재완료됨 = new 결재완료됨(fee);
            결재완료됨.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
