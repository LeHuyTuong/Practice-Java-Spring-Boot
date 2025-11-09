package fa25.se196853.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "suppliers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Supply {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private int supplierId;

    @NotNull
    @Column(name = "supplier_name" , length = 50, unique = true)
    private String supplierName;

    @NotNull
    @Column(name = "contact_phone" , length = 15)
    private String contactPhone;

    @NotNull
    @Column(name = "email", length = 50)
    private String email;
}
