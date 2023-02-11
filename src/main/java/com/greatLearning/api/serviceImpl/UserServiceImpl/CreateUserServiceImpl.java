package com.greatLearning.api.serviceImpl.UserServiceImpl;

import com.greatLearning.api.entity.User;
import com.greatLearning.api.repository.UserRepository;
import com.greatLearning.api.service.UserService.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateUserServiceImpl implements CreateUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        user.setPassword(passwordEncoder(user.getPassword()));
        this.userRepository.save(user);
    }

    public String passwordEncoder(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
