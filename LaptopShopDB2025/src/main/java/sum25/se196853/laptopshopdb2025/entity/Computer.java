package sum25.se196853.laptopshopdb2025.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "computers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computers_id")
    private Integer computerId;

    @NotNull
    @Column(name = "type")
    private String type;

    @NotNull
    @Column(name = "computer_brand")
    private String computerBrand;

    @NotNull
    @Column(name = "production_year")
    private Integer year;

    @NotNull
    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Manufacturer manufacturer;


}
