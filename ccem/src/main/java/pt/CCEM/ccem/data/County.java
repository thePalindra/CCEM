package pt.CCEM.ccem.data;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "counties", schema = "public")
public class County {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="county_id")
    private Long id;
    private String name;
    private String description;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "space_id")
    private Space space;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "region_id")
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
