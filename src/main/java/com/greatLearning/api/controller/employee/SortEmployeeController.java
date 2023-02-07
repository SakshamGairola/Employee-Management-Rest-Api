package com.greatLearning.api.controller.employee;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.service.EmployeeService.SortEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class SortEmployeeController {

    @Autowired
    SortEmployeeService sortService;

    @GetMapping("/sort")
    public List<Employee> getEmployeesSortedByFirstName(@RequestParam(name = "order") String order){
        return this.sortService.getEmployeesSortedByFirstName(order);
    }
}
