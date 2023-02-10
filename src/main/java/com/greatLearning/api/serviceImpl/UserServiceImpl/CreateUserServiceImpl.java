package com.greatLearning.api.serviceImpl.UserServiceImpl;

import com.greatLearning.api.entity.User;
import com.greatLearning.api.repository.UserRepository;
import com.greatLearning.api.service.UserService.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserServiceImpl implements CreateUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        this.userRepository.save(user);
    }
}
