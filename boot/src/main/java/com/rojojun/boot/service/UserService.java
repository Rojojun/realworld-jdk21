package com.rojojun.boot.service;

import com.rojojun.boot.functional.FunctionalUtils;
import com.rojojun.realworlddata.entity.User;
import com.rojojun.realworlddata.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private FunctionalUtils functionalUtils;

    public Long saveUser() {
        return functionalUtils.getId(userRepository.save(User.of("name", "email", "password")));
    }
}
