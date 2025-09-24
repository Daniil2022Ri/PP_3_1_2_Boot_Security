package ru.kata.spring.boot_security.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodePasswords {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String usernameUser = "user";
        String passwordUser = "user";

        String usernameAdmin = "admin";
        String passwordAdmin = "admin";

        String encodedPasswordUser = encoder.encode(passwordUser);
        String encodedPasswordAdmin = encoder.encode(passwordAdmin);

        System.out.println("User: " + usernameUser + " Password: " + encodedPasswordUser);
        System.out.println("Admin: " + usernameAdmin + " Password: " + encodedPasswordAdmin);
    }
    //Шифрую пароли чтобы добавить в базу
}
