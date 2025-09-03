package ru.kata.spring.boot_security.demo.configs.service;

public class WorkerServiceImpl  {

    private final WorkerService workerService;

    public WorkerServiceImpl(WorkerService workerService){
        this.workerService = workerService;
    }


}
