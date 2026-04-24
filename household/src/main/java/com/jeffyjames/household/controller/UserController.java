package com.jeffyjames.household.controller;

import com.jeffyjames.household.dto.LoginRequestDTO;
import com.jeffyjames.household.dto.LoginResponseDTO;
import com.jeffyjames.household.dto.UserRequestDTO;
import com.jeffyjames.household.dto.UserResponseDTO;
import com.jeffyjames.household.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ Create user
    @PostMapping
    public UserResponseDTO createUser(@Valid @RequestBody UserRequestDTO request) {
        return userService.createUser(request);
    }

    // ✅ Login
    @PostMapping("/login")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO request) {
        return userService.login(request);
    }

    // 🔥 ADD THIS: Get all users
    @GetMapping
    public List<UserResponseDTO> getAllUsers() {
        return userService.getAllUsers();
    }
}