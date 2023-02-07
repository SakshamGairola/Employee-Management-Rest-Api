package com.greatLearning.api.serviceImpl.EmployeeServiceImpl;

import com.greatLearning.api.repository.EmployeeRepository;
import com.greatLearning.api.service.EmployeeService.DeleteEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteEmployeeServiceImpl implements DeleteEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String deleteEmployeeByID(Long ID) {
        try {
            employeeRepository.deleteById(ID);
        } catch (Exception e) {
            return "Employee with id - " + ID + " does not exist.";
        }
        return "Deleted employee id - " + ID;
    }

}
