package complainment.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// import complainment.config.security.OAuthFeignConfig;

//<<< Resilency / Circuit Breaker
@FeignClient(name = "payment", url = "${api.url.payment}")
public interface FeeService {
    @RequestMapping(method = RequestMethod.POST, path = "fees/{id}/pay")
    public void pay(@PathVariable("id") String id, @RequestBody Fee fee);
}
