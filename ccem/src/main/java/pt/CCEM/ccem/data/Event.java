package pt.CCEM.ccem.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
