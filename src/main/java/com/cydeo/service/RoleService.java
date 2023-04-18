package com.cydeo.service;

import com.cydeo.dto.RoleDTO;


import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();//this method call the controller
    RoleDTO findById(Long id);  //this method not query this method basic method
}
