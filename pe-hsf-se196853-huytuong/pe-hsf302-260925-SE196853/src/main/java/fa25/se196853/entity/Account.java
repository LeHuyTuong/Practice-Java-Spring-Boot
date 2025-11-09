package fa25.se196853.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "accounts")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int accountId;

    @NotNull
    @Column(name = "email" , length = 50, unique = true)
    private String email;

    @NotNull
    @Column(name = "password" , length = 20)
    private String password;

    @NotNull
    @Column(name = "role", length = 10)
    private String role;
}
