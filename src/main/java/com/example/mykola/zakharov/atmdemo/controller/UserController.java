package com.example.mykola.zakharov.atmdemo.controller;

import com.example.mykola.zakharov.atmdemo.model.ResponseModel;
import com.example.mykola.zakharov.atmdemo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atmdemo")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}/userbalance")
    public ResponseEntity<ResponseModel> getUserBalance(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserBalance(id), HttpStatus.OK);
    }

}
