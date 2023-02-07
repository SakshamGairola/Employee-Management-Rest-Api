package com.greatLearning.api.serviceImpl.EmployeeServiceImpl;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.repository.EmployeeRepository;
import com.greatLearning.api.service.EmployeeService.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee updateEmployee(Employee employee) {
        this.employeeRepository.save(employee);
        return employee;
    }
}
