package complainment.infra;

import complainment.domain.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/fees")
@Transactional
public class FeeController {

    @Autowired
    FeeRepository feeRepository;

    @RequestMapping(
        value = "fees/{id}/pay",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Fee pay(
        @PathVariable(value = "id") String id,
        @RequestBody Fee fee,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        Long longId = Long.parseLong(id);
        fee.setId(longId);
        feeRepository.save(fee);
        return fee;
    }
}
