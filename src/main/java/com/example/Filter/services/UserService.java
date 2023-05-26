package com.example.Filter.services;

import com.example.Filter.dtos.ResponseDTO;
import com.example.Filter.model.User;
import com.example.Filter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseDTO getUsers() {
        ResponseDTO responseDTO = new ResponseDTO();
        User user = userRepository.findByFirstNameAndAge("Rohan",24);

        responseDTO.setData(user.toDTO());
        return responseDTO;
    }
}
