package com.greatLearning.api.controller.employee;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.service.EmployeeService.SearchEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class SearchEmployeeController {

    @Autowired
    SearchEmployeeService searchService;

    @GetMapping("/search/{keyword}")
    public List<Employee> getSearchResults(@PathVariable("keyword") String keyword){
        return this.searchService.searchByFirstName(keyword);
//        return null;
    }
}
