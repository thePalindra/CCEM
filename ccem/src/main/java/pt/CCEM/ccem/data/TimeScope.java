package pt.CCEM.ccem.data;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
public class TimeScope {

    private Date start;
    private Date end;

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
