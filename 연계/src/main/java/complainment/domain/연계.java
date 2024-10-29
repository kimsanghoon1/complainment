package complainment.domain;

import complainment.연계Application;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "연계_table")
@Data
//<<< DDD / Aggregate Root
public class 연계 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static 연계Repository repository() {
        연계Repository 연계Repository = 연계Application.applicationContext.getBean(
            연계Repository.class
        );
        return 연계Repository;
    }

    //<<< Clean Arch / Port Method
    public static void 연계등록(결재완료됨 결재완료됨) {
        //implement business logic here:

        /** Example 1:  new item 
        연계 연계 = new 연계();
        repository().save(연계);

        */

        /** Example 2:  finding and process
        
        repository().findById(결재완료됨.get???()).ifPresent(연계->{
            
            연계 // do something
            repository().save(연계);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
