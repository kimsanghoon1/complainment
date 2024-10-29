package complainment.domain;

import complainment.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "연계", path = "연계")
public interface 연계Repository extends JpaRepository<연계, Long> {}
