package pe_hsf302_trialexam_SE196853.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "manufactures")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Manufacture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufacturer_id")
    private int manufactureId;

    @Column(name = "manufacturer_name", unique = true   )
    @NotNull
    private String manufactureName;

    @Column(name = "country", length = 100)
    private String country;

}
