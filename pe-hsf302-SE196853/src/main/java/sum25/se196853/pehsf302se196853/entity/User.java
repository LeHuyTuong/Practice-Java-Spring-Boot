package sum25.se196853.pehsf302se196853.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;

    private String role;
}
