package part.spring.agregadordeinvestimentos.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class User {

    //Aqui ele irá usar o user id como um identificador (uma primary key)
    @Id

    //Aqui ele irá gerar um Id automaticamente
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    //Com esse @Column ele identifica quem é quem no banco de dados
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;


    @CreationTimestamp
    private Instant creationTimestamp;

    @UpdateTimestamp
    private Instant updateTimestamp;



    //Criação dos Construtores

    public User(UUID userId, String username, String password, String email, Instant now, Object o) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.creationTimestamp = creationTimestamp;
        updateTimestamp = updateTimestamp;
    }

    public User() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Instant creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Instant getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Instant updateTimestamp) {
        updateTimestamp = updateTimestamp;
    }
}
/*Esse aqui foi o primeiro passo, criar a entidade user e depois os construtores
Agora é criar o Controller
*/