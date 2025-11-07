package sum25.se196853.laptopshopdb2025.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Table(name = "users")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    private Integer id;

    @NotNull
    @Column(unique = true, length = 100)
    private String email;

    @NotNull
    @Column(length = 50)
    private String password;

    @NotNull
    @Column(length = 20)
    private String role;
}

