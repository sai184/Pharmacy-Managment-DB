package com.pharmacy.controllers;

import com.pharmacy.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @PostMapping("/login")
    public boolean login(@RequestParam String username,
                         @RequestParam String password,
                         @RequestParam String role) {
        return userDAO.login(username, password, role);
    }
}
