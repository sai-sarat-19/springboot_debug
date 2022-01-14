package com.crio.coursework.repository;

import com.crio.coursework.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username, String password);

    User findTopByUsername(String username);

    User findTopByPassword(String password);

}
