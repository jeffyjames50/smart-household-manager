package com.jeffyjames.household.controller;

import com.jeffyjames.household.dto.UserRequestDTO;
import com.jeffyjames.household.dto.UserResponseDTO;
import com.jeffyjames.household.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponseDTO createUser(@Valid @RequestBody UserRequestDTO request) {
        return userService.createUser(request);
    }
}