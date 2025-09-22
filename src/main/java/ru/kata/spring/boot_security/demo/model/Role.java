package ru.kata.spring.boot_security.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name = "role_user")
public class Role implements GrantedAuthority {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name")
    private String name;

    public Role(Long id, String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public String getAuthority() {
        return name;
    }
}
