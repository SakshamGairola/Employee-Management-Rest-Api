package com.greatLearning.api.controller.user;

import com.greatLearning.api.entity.User;
import com.greatLearning.api.service.UserService.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/user")
public class CreateUserController {

    @Autowired
    CreateUserService createService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        this.createService.createUser(user);
        return user;
    }

}
