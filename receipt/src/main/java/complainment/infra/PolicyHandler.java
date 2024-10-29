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
    public Consumer<Message<결재실패>> whenever결재실패_ApplyFail() {
        return event -> {
            결재실패 결재실패 = event.getPayload();
            Complainment.applyFail(결재실패);
        };
    }
}
//>>> Clean Arch / Inbound Adaptor
