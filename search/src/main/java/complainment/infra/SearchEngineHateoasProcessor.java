package complainment.infra;

import complainment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SearchEngineHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SearchEngine>> {

    @Override
    public EntityModel<SearchEngine> process(EntityModel<SearchEngine> model) {
        return model;
    }
}
