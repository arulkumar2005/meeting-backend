package com.example.meetingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meetingapp.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}