package sum25.se196853.pehsf302trialse196853.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "manufacturers")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String manufacturer_id;

    @Column(name = "manufacturer_name")
    private String manufacturer_name;

    @Column(name = "country")
    private String country;
}
