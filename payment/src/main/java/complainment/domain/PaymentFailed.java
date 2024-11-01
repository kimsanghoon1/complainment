package complainment.domain;

import complainment.domain.*;
import complainment.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentFailed extends AbstractEvent {

    private Long id;
    private String complainId;
    private Long charge;

    public PaymentFailed(Fee aggregate) {
        super(aggregate);
    }

    public PaymentFailed() {
        super();
    }
}
//>>> DDD / Domain Event
