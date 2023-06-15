package pt.CCEM.ccem.data;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Builder
@AllArgsConstructor
public class Region {

    private String name;
    private Space space;
    private String description;
}
