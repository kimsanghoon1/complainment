package complainment.domain;

import complainment.domain.*;
import complainment.infra.AbstractEvent;
import jakarta.persistence.Embedded;

import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ComplaintReceived extends AbstractEvent {

    private Long id;
    private String complainId;
    private String userId;
    @Embedded
    private ComplainmentDetail detail;

    public ComplaintReceived(Complainment aggregate) {
        super(aggregate);
    }

    public ComplaintReceived() {
        super();
    }
}
//>>> DDD / Domain Event
