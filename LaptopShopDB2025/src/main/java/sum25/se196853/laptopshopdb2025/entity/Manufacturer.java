package sum25.se196853.laptopshopdb2025.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "manufacturers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufacturers_id")
    private Integer id;

    @NotNull
    @Column(name = "manufacturer_name", length = 100)
    private String name;

    @NotNull
    @Column(name = "country", length = 100)
    private String country;

}
