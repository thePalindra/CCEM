package pt.CCEM.ccem.data;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Builder
@AllArgsConstructor
public class Region {

    private Long id;
    private String name;
    private String description;
    private Space space;

    public String getName() {
        return this.name;
    }

    public Space getSpace() {
        return this.space;
    }

    public String getDescription() {
        return this.description;
    }
}
