package com.example.Filter.repository;

import com.example.Filter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByFirstNameAndAge(String name,int age);
}
