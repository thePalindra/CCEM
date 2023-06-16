package pt.CCEM.ccem.data;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "regions", schema = "public")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="region_id")
    private Long id;
    private String name;
    private String description;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "space_id")
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
