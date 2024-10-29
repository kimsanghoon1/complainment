package complainment.infra;

import complainment.domain.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/starSchemes")
@Transactional
public class StarSchemeController {

    @Autowired
    StarSchemeRepository starSchemeRepository;
}
//>>> Clean Arch / Inbound Adaptor
