package org.itstep.springthymeleafusers.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleRestController {

    @Autowired
    private  RoleService roleService;

    @GetMapping("/roles")
    List<Role> findAll() {
        return roleService.findAll();
    }
}
