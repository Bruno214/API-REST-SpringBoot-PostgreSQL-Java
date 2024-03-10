package com.dio.springweb.myprojectwebapi.controller;

import com.dio.springweb.myprojectwebapi.DTO.UserRequestDTO;
import com.dio.springweb.myprojectwebapi.DTO.UserRequestUpdateDTO;
import com.dio.springweb.myprojectwebapi.model.User;
import com.dio.springweb.myprojectwebapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list-users")
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.listUsers();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping("/register")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequestDTO userRequestDTO) {
        User user = userService.saveUser(userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable Long userId) {
        userService.deleteUserById(userId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody @Valid UserRequestUpdateDTO dados) {
        User user = new User(dados);
        User novoUser = userService.updateUser(userId, user);
        return ResponseEntity.status(HttpStatus.OK).body(novoUser);
    }

}
