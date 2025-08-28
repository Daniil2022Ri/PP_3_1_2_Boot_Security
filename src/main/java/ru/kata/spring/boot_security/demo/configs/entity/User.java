package ru.kata.spring.boot_security.demo.configs.entity;




public class User {


    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    private String work;
    private int moneyWork;
    private String card;


    public User(int id, String firstName, String lastName, String email,
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

    public void setId(int id){
        this.id = id;
    }
    public void getId(int id){
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
                " firstName - '" + firstName +
                " lastName - " + lastName +
                " email - " + email +
                " age - " + age +
                " money - " + moneyWork +
                " card - " + card ;
    }
}
