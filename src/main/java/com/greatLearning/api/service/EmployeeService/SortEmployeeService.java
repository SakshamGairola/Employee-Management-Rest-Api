package com.greatLearning.api.service.EmployeeService;

import com.greatLearning.api.entity.Employee;

import java.util.List;

public interface SortEmployeeService {
    List<Employee> getEmployeesSortedByFirstName(String sortOrder);
}
