package com.pharm.pharmacy.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pharm.pharmacy.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}