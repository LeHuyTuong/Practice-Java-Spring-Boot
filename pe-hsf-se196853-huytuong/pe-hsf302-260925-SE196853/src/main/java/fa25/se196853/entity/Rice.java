package fa25.se196853.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;

@Table(name = "rices")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rice_id")
    private int riceId;

    @NotNull
    @Column(name = "rice_name" , length = 100)
    private String riceName;

    @NotNull
    @Column(name = "price" , length = 15)
    private double price;
//
//    @Column(name = "created_at", nullable = true)
//    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable = false)
    private Supply supply;
}
