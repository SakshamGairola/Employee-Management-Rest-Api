package com.greatLearning.api.controller.user;

import com.greatLearning.api.entity.User;
import com.greatLearning.api.serviceImpl.UserServiceImpl.ReadUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/user")
public class ReadUserController {

    @Autowired
    ReadUserServiceImpl readService;

    @GetMapping("/all")
    public List<User> getRoles() {
        return this.readService.getALL();
    }

}
