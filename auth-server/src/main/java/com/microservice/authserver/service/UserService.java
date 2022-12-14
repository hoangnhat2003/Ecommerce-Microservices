package com.microservice.authserver.service;

import com.microservice.authserver.domain.document.User;
import com.microservice.authserver.domain.exception.AuthExceptionHandling;
import com.microservice.authserver.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) throws AuthExceptionHandling {
        User user = userRepository.findByEmail(email);
        if (user == null)
            throw new AuthExceptionHandling("Email has not been registered");
        return user;
    }
}
