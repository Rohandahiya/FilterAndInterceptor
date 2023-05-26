package com.example.Filter.controllers;

import com.example.Filter.dtos.ResponseDTO;
import com.example.Filter.interceptors.UserInterceptor;
import com.example.Filter.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    public UserInterceptor userInterceptor;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public ResponseEntity<?> getUsers(){

        userInterceptor.customFuction();
        ResponseDTO responseDTO = userService.getUsers();

        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }

}
