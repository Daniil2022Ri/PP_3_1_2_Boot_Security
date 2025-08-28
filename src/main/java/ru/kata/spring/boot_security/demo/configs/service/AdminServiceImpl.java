package ru.kata.spring.boot_security.demo.configs.service;

import ru.kata.spring.boot_security.demo.configs.entity.User;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    @Override
    public void AddNewWorker(int id, String firstName, String lastname, int age, String email, String work, int money, String card) {

    }

    @Override
    public void UpadateUserWork(String work, int money, String card) {

    }

    @Override
    public void DeleteWorker(int id, String firstName, String lastName) {

    }

    @Override
    public void ByMoneyWorker(int id, String firstName, String lastName, String card, String work, int money) {

    }

    @Override
    public List<User> AllWorker() {
        return List.of();
    }
}
