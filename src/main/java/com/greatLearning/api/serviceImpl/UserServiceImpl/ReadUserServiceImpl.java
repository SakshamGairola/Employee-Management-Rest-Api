package com.greatLearning.api.serviceImpl.UserServiceImpl;

import com.greatLearning.api.entity.User;
import com.greatLearning.api.repository.UserRepository;
import com.greatLearning.api.service.UserService.ReadUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadUserServiceImpl implements ReadUserService {
    @Autowired
    UserRepository repository;

    @Override
    public List<User> getALL() {
        return this.repository.findAll();
    }
}
