package com.greatLearning.api.controller.role;

import com.greatLearning.api.entity.Role;
import com.greatLearning.api.service.RoleSevice.CreateRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/role")
public class CreateRoleController {

    @Autowired
    CreateRoleService createService;

    @PostMapping("/create")
    public Role createRole(@RequestBody Role role) {
        this.createService.createRole(role);
        return role;
    }

}
