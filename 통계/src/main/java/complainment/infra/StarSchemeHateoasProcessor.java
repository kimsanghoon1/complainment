package complainment.infra;

import complainment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StarSchemeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<StarScheme>> {

    @Override
    public EntityModel<StarScheme> process(EntityModel<StarScheme> model) {
        return model;
    }
}
