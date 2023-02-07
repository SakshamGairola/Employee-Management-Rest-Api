package com.greatLearning.api.serviceImpl.EmployeeServiceImpl;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.repository.EmployeeRepository;
import com.greatLearning.api.service.EmployeeService.SearchEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchEmployeeServiceImpl implements SearchEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> searchByFirstName(String keyword) {
        Employee employee = new Employee();
        employee.setFirstName(keyword);
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAny()
                .withMatcher("firstName", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase())
                .withIgnorePaths("lastName", "empEmail");
        Example<Employee> example = Example.of(employee, exampleMatcher);
        return this.employeeRepository.findAll(example);
    }
}
