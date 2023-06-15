package pt.CCEM.ccem.data;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Builder
@AllArgsConstructor
public class County {

    private Long id;
    private String name;
    private String description;
    private Space space;
    private Region region;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Space getSpace() {
        return this.space;
    }

    public Region getRegion() {
        return this.region;
    }
}
