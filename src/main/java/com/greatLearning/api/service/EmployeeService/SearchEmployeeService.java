package com.greatLearning.api.service.EmployeeService;

import com.greatLearning.api.entity.Employee;

import java.util.List;

public interface SearchEmployeeService {
    List<Employee> searchByFirstName(String keyword);
}
