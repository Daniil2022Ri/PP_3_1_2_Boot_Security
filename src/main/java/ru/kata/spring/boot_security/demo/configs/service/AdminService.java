package ru.kata.spring.boot_security.demo.configs.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.configs.entity.User;

import java.util.List;

@Service
public interface AdminService {

    public void AddNewWorker(int id, String firstName , String lastname , int age , String email ,
                           String work, int money , String card);


    public void UpadateUserWork(String work , int money, String card);

    public void DeleteWorker(int id , String firstName, String lastName);

    public void ByMoneyWorker(int id, String firstName , String lastName, String card , String work ,int money);

    public List<User> AllWorker();
}
