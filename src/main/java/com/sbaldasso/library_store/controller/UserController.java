package com.sbaldasso.library_store.controller;

import com.sbaldasso.library_store.domain.User;
import com.sbaldasso.library_store.dto.UserDTO;
import com.sbaldasso.library_store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody UserDTO user, @PathVariable Long id) {
        userService.updateUser(id, user);
        return new ResponseEntity<>("User updated successfully", HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}