package complainment.domain;

import complainment.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "searchEngines",
    path = "searchEngines"
)
public interface SearchEngineRepository
    extends JpaRepository<SearchEngine, Long> {}
