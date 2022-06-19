package org.itstep.springthymeleafusers.user;

import lombok.Data;
import org.itstep.springthymeleafusers.role.Role;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String firstName; //Если здесь заглавная буква, то в схеме базы данных здесь будет знак подчеркивания (преобразование из CamelCase в snake_case)
    private String lastName;
    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    public Long getId() {
        return id;
    }

    // remaining getters and setters are not shown for brevity
}
