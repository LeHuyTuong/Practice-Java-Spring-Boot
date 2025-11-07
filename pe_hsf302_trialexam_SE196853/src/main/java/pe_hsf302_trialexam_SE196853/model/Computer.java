package pe_hsf302_trialexam_SE196853.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "computers")
@NoArgsConstructor
@AllArgsConstructor
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computer_id")
    private int id;

    @Column(name = "computer_model", length = 100)
    @NotNull
    private String computerModel;

    @Column(name = "type", length = 50)
    @NotNull
    private String type;

    @Column(name = "production_year")
    private int year;

    @Column(name ="price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacture  manufacture;

}
