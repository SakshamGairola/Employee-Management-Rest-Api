package com.greatLearning.api.controller.employee;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.service.EmployeeService.CreateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class CreateEmployeeController {

    @Autowired
    CreateEmployeeService createService;

    @PostMapping("/create")
    public String createEmployee(@RequestBody Employee employee) {
        this.createService.createEmployee(employee);
        return employee.toString();
    }
}
