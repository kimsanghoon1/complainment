package complainment.domain;

import complainment.SearchApplication;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "SearchEngine_table")
@Data
//<<< DDD / Aggregate Root
public class SearchEngine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static SearchEngineRepository repository() {
        SearchEngineRepository searchEngineRepository = SearchApplication.applicationContext.getBean(
            SearchEngineRepository.class
        );
        return searchEngineRepository;
    }

    //<<< Clean Arch / Port Method
    public static void indexing(ComplaintReceived complaintReceived) {
        //implement business logic here:

        /** Example 1:  new item 
        SearchEngine searchEngine = new SearchEngine();
        repository().save(searchEngine);

        */

        /** Example 2:  finding and process
        
        repository().findById(complaintReceived.get???()).ifPresent(searchEngine->{
            
            searchEngine // do something
            repository().save(searchEngine);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
