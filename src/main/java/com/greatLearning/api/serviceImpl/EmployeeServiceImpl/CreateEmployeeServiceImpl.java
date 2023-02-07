package com.greatLearning.api.serviceImpl.EmployeeServiceImpl;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.repository.EmployeeRepository;
import com.greatLearning.api.service.EmployeeService.CreateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateEmployeeServiceImpl implements CreateEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }
}
