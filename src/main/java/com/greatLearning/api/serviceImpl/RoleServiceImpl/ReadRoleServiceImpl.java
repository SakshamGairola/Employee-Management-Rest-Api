package com.greatLearning.api.serviceImpl.RoleServiceImpl;

import com.greatLearning.api.entity.Role;
import com.greatLearning.api.repository.RoleRepository;
import com.greatLearning.api.service.RoleSevice.ReadRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadRoleServiceImpl implements ReadRoleService {
    @Autowired
    RoleRepository repository;

    @Override
    public List<Role> getALL(){
        return this.repository.findAll();
    }
}
