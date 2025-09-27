package ru.kata.spring.boot_security.demo.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

@Service
@Lazy
public interface UserService {
    List<User> listAll();
    void save(User user);
    User get(Long id);
    void delete(Long id);
    User getUserByUsername(String username);
}
