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
    public Consumer<Message<ComplaintReceived>> wheneverComplaintReceived_Indexing() {
        return event -> {
            ComplaintReceived complaintReceived = event.getPayload();
            SearchEngine.indexing(complaintReceived);
        };
    }
}
//>>> Clean Arch / Inbound Adaptor
