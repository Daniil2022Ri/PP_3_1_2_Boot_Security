package ru.kata.spring.boot_security.demo.configs.service;

import org.springframework.stereotype.Service;

@Service
public interface WorkerService {

    public void Working(int id , String firstName, String lastName);
    public void EndWorking(int id , String firstName, String lastName , String WhyWorking);

    public void TakeMoney(int id, String firstName, String lastName, String email);

}
