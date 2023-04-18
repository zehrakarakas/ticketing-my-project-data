package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface UserRepository extends JpaRepository<User,Long> {

    //get user based on username

    User findByUserName(Long id);

}
