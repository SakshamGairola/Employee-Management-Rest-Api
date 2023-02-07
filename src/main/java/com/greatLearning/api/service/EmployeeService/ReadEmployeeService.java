package com.greatLearning.api.service.EmployeeService;

import com.greatLearning.api.entity.Employee;

import java.util.List;

public interface ReadEmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeByID(Long ID);

    List<Employee> getEmployeeWithTheseID(List<Long> listID);

}
