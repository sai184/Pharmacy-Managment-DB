package com.pharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pharmacy.dao.UserDAO;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public boolean validateUserLogin(String username, String password, String role) {
        return userDAO.login(username, password, role);
    }
}
