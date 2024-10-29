package complainment.domain;

import complainment.통계Application;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "StarScheme_table")
@Data
//<<< DDD / Aggregate Root
public class StarScheme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static StarSchemeRepository repository() {
        StarSchemeRepository starSchemeRepository = 통계Application.applicationContext.getBean(
            StarSchemeRepository.class
        );
        return starSchemeRepository;
    }

    //<<< Clean Arch / Port Method
    public static void 적재(ComplaintReceived complaintReceived) {
        //implement business logic here:

        /** Example 1:  new item 
        StarScheme starScheme = new StarScheme();
        repository().save(starScheme);

        */

        /** Example 2:  finding and process
        
        repository().findById(complaintReceived.get???()).ifPresent(starScheme->{
            
            starScheme // do something
            repository().save(starScheme);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
