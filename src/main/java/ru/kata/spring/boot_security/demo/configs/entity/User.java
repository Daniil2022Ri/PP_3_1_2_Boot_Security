package ru.kata.spring.boot_security.demo.configs.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "worker")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private int age;

    @Column
    private String work;
    @Column
    private int moneyWork;
    @Column
    private String card;


    public void setId(long id){
        this.id = id;
    }
    public void getId(long id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void getFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void getLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void getEmail(String email){
        this.email = email;
    }
    public void setWork(String work){
        this.work = work;
    }
    public void getWork(String work){
        this.work = work;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getAge(int age) {
        this.age = age;
    }
    public void setMoneyWork(int moneyWork) {
        this.moneyWork = moneyWork;
    }
    public void getMoneyWork(int moneyWork) {
        this.moneyWork = moneyWork;
    }

    public void setCard(String email){
        this.email = email;
    }
    public void getCard(String email){
        this.email = email;
    }


    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id")
    )
    private Set<Role> roles = new HashSet<>();

    @Override
    public String toString(){
        return "User" +
                "id - " + id +
                " firstName - '" + firstName +
                " lastName - " + lastName +
                " email - " + email +
                " age - " + age +
                " money - " + moneyWork +
                " card - " + card ;
    }
}
