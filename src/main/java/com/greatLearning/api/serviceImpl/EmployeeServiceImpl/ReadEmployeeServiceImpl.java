package com.greatLearning.api.serviceImpl.EmployeeServiceImpl;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.repository.EmployeeRepository;
import com.greatLearning.api.service.EmployeeService.ReadEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadEmployeeServiceImpl implements ReadEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByID(Long ID) {
        Employee employee = null;
        try {
            employee = this.employeeRepository.findById(ID).get();
        } catch (Exception e) {
        }
        return employee;
    }

    @Override
    public List<Employee> getEmployeeWithTheseID(List<Long> listID) {
        return this.employeeRepository.findAllById(listID);
    }

}
