package complainment.domain;

import complainment.domain.*;
import complainment.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 결재완료됨 extends AbstractEvent {

    private Long id;
    private String 접수번호;
    private Long 수수료;
}
