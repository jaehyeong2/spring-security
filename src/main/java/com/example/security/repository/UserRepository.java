package com.example.security.repository;

import com.example.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //생략가능. jparepository가 가지고 있음
public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByUsername(String username);
}
