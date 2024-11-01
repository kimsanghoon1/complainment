package complainment.domain;

import complainment.ComplaintApplication;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "Complaint_table")
@Data
//<<< DDD / Aggregate Root
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String complainId;
    private String userId;
    private String result;

    public static ComplaintRepository repository() {
        ComplaintRepository complaintRepository = ComplaintApplication.applicationContext.getBean(
            ComplaintRepository.class
        );
        return complaintRepository;
    }

    //<<< Clean Arch / Port Method
    public static void applyComplain(ComplaintReceived complaintReceived) {
        
        Complaint complaint = new Complaint();
        complaint.setComplainId(complaintReceived.getComplainId());
        complaint.setUserId(complaintReceived.getUserId());
        repository().save(complaint);
        //implement business logic here:

        /** Example 1:  new item 
        Complaint complaint = new Complaint();
        repository().save(complaint);

        */

        /** Example 2:  finding and process
        
        repository().findById(complaintReceived.get???()).ifPresent(complaint->{
            
            complaint // do something
            repository().save(complaint);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
