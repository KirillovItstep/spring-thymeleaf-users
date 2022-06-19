package org.itstep.springthymeleafusers.user;

import org.itstep.springthymeleafusers.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @GetMapping({"/index","/"})
    public String index() {
        return "index";
    }

        // Login form
        @GetMapping("/login")
        public String login() {
            return "login";
        }

        // Login form with error
        @GetMapping("/login-error")
        public String loginError(Model model) {
            model.addAttribute("loginError", true);
            return "login";
        }

    @GetMapping(value ="/users" )
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }
    }