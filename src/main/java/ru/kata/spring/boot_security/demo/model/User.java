package ru.kata.spring.boot_security.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User {

    @Column
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

}
