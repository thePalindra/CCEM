package pt.CCEM.ccem.data;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Builder
@AllArgsConstructor
public class Event {

    private Long id;
    private String name;
    private Space space;
    private String tag;
    private String description;
    private TimeScope timeScope;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Space getSpace() {
        return space;
    }

    public String getTag() {
        return tag;
    }

    public String getDescription() {
        return description;
    }

    public TimeScope getTimeScope() {
        return timeScope;
    }
}
