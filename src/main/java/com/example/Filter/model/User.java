package com.example.Filter.model;

import com.example.Filter.dtos.UserDTO;
import jakarta.persistence.*;

@Entity
@Table(schema = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "Age")
    private int age;

    public UserDTO toDTO(){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(this.id);
        userDTO.setFirstName(this.firstName);
        userDTO.setAge(this.age);

        return userDTO;
    }
}
