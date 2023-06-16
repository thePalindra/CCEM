package pt.CCEM.ccem.data;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "spaces", schema = "public")
public class TimeScope {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="time_scope_id")
    private Long id;
    private Date start;
    private Date end;

    public Long getId() {
        return this.id;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}
