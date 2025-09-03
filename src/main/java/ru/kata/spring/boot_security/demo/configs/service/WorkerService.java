package ru.kata.spring.boot_security.demo.configs.service;

import org.springframework.stereotype.Service;

//@Service
public interface WorkerService {

    public void Working(Long id , String firstName, String lastName);
    public void EndWorking(Long id , String firstName, String lastName , String WhyWorking);
    public void StartingWork(Long id ,String firstName, String lastName);
    public void TakeMoney(Long id, String firstName, String lastName, String email);

}
