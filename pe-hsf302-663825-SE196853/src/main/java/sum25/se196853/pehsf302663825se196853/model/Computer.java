package sum25.se196853.pehsf302663825se196853.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "computers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="computer_id")
    private int id;

    @Column(name ="computer_model")
    private String model;

    @Column(name ="type")
    private String type;

    @Column(name ="production_year")
    private String year;

    @Column(name = "price")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Manufacturer manu;

}
