package com.greatLearning.api.controller.employee;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.service.EmployeeService.ReadEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class ReadEmployeeController {
    @Autowired
    ReadEmployeeService readService;

    @GetMapping("/get")
    public List<Employee> getAllEmployees(){
        return this.readService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeByID(@PathVariable("id") Long ID){
        return this.readService.getEmployeeByID(ID);
    }

    @PostMapping("/get")
    public List<Employee> getEmployeeWithTheseID(@RequestBody List<Long> listID){
        return this.readService.getEmployeeWithTheseID(listID);
    }

}
