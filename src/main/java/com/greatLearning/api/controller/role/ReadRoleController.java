package com.greatLearning.api.controller.role;

import com.greatLearning.api.entity.Role;
import com.greatLearning.api.serviceImpl.RoleServiceImpl.ReadRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/role")
public class ReadRoleController {

    @Autowired
    ReadRoleServiceImpl readService;

    @GetMapping("/all")
    public List<Role> getRoles() {
        return this.readService.getALL();
    }

}
