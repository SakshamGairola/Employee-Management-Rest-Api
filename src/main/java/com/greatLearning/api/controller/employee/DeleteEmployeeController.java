package com.greatLearning.api.controller.employee;

import com.greatLearning.api.service.EmployeeService.DeleteEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class DeleteEmployeeController {

    @Autowired
    DeleteEmployeeService deleteService;

    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeByID(@PathVariable("id") Long ID) {
        return this.deleteService.deleteEmployeeByID(ID);
    }

}
