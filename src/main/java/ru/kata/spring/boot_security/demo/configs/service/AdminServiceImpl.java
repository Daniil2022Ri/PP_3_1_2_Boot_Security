package ru.kata.spring.boot_security.demo.configs.service;

import ru.kata.spring.boot_security.demo.configs.entity.Worker;

import java.util.List;

public class AdminServiceImpl {

    private final AdminService adminService;

    public AdminServiceImpl (AdminService adminService){
        this.adminService = adminService;
    }

    public List<Worker> findAllWorkers(){
        return adminService.AllWorker();
    }
    public void addWorkerFromProject()
}
