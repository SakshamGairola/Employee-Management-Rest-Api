package com.greatLearning.api.security.serviceImpl;

import com.greatLearning.api.entity.User;
import com.greatLearning.api.repository.UserRepository;
import com.greatLearning.api.security.SecurityUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.getUserByName(userName);
        if(user == null){
            throw new UsernameNotFoundException("User with name '" + userName + "' not found");
        }
        return new SecurityUserDetails(user);
    }
}
