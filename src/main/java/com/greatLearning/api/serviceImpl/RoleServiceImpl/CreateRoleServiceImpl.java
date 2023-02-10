package com.greatLearning.api.serviceImpl.RoleServiceImpl;

import com.greatLearning.api.entity.Role;
import com.greatLearning.api.repository.RoleRepository;
import com.greatLearning.api.service.RoleSevice.CreateRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateRoleServiceImpl implements CreateRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void createRole(Role role) {
        this.roleRepository.save(role);
    }
}
