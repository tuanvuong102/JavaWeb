package com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.controller;


import com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.dto.UsersDTO;
import com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.entity.Users;
import com.k21cnt.tvc.lession4.com.k21cnt.tvc.lession4.service.UsersService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor

public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/user-List")
    public List<Users> findAllUsers() {
        return usersService.findAll();
    }
    @PostMapping("/user-add")
    public ResponseEntity<String> addUser(@Valid @RequestBody UsersDTO usersDTO) {
        usersService.create(usersDTO);
        return ResponseEntity.badRequest().body("Users created successfully");
    }
}
