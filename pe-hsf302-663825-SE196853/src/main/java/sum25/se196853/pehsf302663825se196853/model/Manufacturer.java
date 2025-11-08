package sum25.se196853.pehsf302663825se196853.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "manufacturers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="manufacturer_id")
    private int id;

    @Column(name = "manufacturer_name")
    private String name;

    @Column(name ="country")
    private String country;
}
