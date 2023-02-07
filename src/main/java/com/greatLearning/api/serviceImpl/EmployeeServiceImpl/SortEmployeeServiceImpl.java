package com.greatLearning.api.serviceImpl.EmployeeServiceImpl;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.repository.EmployeeRepository;
import com.greatLearning.api.service.EmployeeService.SortEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.domain.Sort.Direction.DESC;

@Service
public class SortEmployeeServiceImpl implements SortEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeesSortedByFirstName(String sortOrder) {
        if (sortOrder.equalsIgnoreCase("DESC")) {
            return this.employeeRepository.findAll(Sort.by(DESC, "firstName"));
        }
        return this.employeeRepository.findAll(Sort.by("firstName"));
    }
}
