package com.greatLearning.api.controller.employee;

import com.greatLearning.api.entity.Employee;
import com.greatLearning.api.service.EmployeeService.ReadEmployeeService;
import com.greatLearning.api.service.EmployeeService.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class UpdateEmployeeController {

    @Autowired
    UpdateEmployeeService updateService;

    @Autowired
    ReadEmployeeService readService;

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.updateService.updateEmployee(employee);
    }

    @PatchMapping("/update")
    public Employee patchEmployee(@RequestBody Employee employee) {
        Employee newEmployee = this.readService.getEmployeeByID(employee.getEmpID());

        if (employee.getFirstName() != null) {
            newEmployee.setFirstName(employee.getFirstName());
        }
        if (employee.getLastName() != null) {
            newEmployee.setLastName(employee.getLastName());
        }
        if (employee.getEmpEmail() != null) {
            newEmployee.setEmpEmail(employee.getEmpEmail());
        }

        return this.updateService.updateEmployee(newEmployee);
    }
}
