package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.repository.UserRepository;

import java.util.List;

public interface UserService {


    List<UserDTO> listAllUsers();

    UserDTO findByUserName(String username);

    void save(UserDTO user);

    void deleteByUserName(String username);
    UserDTO update(UserDTO user);

    void delete(String username);//for dont delete db so ektra method adding

    List<UserDTO> listAllByRole(String role);

}
