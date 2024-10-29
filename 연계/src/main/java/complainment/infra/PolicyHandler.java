package complainment.infra;

import complainment.domain.*;
import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Bean
    public Consumer<Message<?>> discardFunction() {
        return message -> {
            // Ingore unnecessary message
            System.out.println("Discarded message: " + message);
        };
    }

    @Bean
    public Consumer<Message<결재완료됨>> whenever결재완료됨_연계등록() {
        return event -> {
            결재완료됨 결재완료됨 = event.getPayload();
            연계.연계등록(결재완료됨);
        };
    }
}
//>>> Clean Arch / Inbound Adaptor
