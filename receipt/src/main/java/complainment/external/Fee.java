package complainment.external;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import complainment.domain.ComplaintReceived;
import lombok.Data;

@Data
public class Fee {

    private Long id;
    private String complainId;
    private Long charge;

}

