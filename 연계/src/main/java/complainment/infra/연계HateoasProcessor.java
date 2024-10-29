package complainment.infra;

import complainment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 연계HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<연계>> {

    @Override
    public EntityModel<연계> process(EntityModel<연계> model) {
        return model;
    }
}
