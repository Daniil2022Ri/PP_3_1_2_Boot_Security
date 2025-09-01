package ru.kata.spring.boot_security.demo.configs.entity;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String roleName;

    public void getRoleName(String roleName) {
        this.roleName = roleName;
    }
    public void setRoleName(String roleName){
        this.roleName = roleName;
    }
}
