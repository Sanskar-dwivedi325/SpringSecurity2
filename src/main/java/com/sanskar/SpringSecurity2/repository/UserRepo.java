package com.sanskar.SpringSecurity2.repository;

import com.sanskar.SpringSecurity2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
   public User findByUsername(String username);
}
