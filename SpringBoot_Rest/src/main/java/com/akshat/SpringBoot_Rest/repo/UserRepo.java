package com.akshat.SpringBoot_Rest.repo;

import com.akshat.SpringBoot_Rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);


}
