package pt.CCEM.ccem.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "events", schema = "public")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private Long id;
    private String name;
    private String tag;
    private String description;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "time_scope_id")
    private TimeScope timeScope;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "space_id")
    private Space space;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Space getSpace() {
        return this.space;
    }

    public String getTag() {
        return this.tag;
    }

    public String getDescription() {
        return this.description;
    }

    public TimeScope getTimeScope() {
        return this.timeScope;
    }
}
