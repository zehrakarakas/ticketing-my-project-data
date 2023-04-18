package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    public final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        //controller called me and requesting all RoleDTOs so it can show in the dropdown in the UI
        //I need to make a call to db and get all the roles from table
        //Go to repository and fing a service which gives me the roles from db
        //1-)How I will call any service here?  ===>answer=)DEPENDCY INJECTION
        List<Role> roleList=roleRepository.findAll();//this method ready in the JPARepository//findAll()-->Drived Query

        return roleList;
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
