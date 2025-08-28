package ru.kata.spring.boot_security.demo.configs.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "worker")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    private String work;
    private int moneyWork;
    private String card;


    public User(long id, String firstName, String lastName, String email,
                String work, String card, int age, int moneyWork){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.work = work;
        this.card = card;
        this.age = age;
        this.moneyWork = moneyWork;
    }

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
