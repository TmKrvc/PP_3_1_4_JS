package ru.kata.spring.boot_security.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class DBInit {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;


    @PostConstruct
    private void postConstruct() {
        roleService.save(new Role("ROLE_ADMIN"));
        roleService.save(new Role("ROLE_USER"));
        String[] role1 = {"ROLE_ADMIN", "ROLE_USER"};
        userService.save(new User("Spider", "Man", "admin"),
                role1, "admin");
        String[] role2 = {"ROLE_USER"};
        userService.save(new User("Jonny", "Cage", "user"),
                role2, "user");
    }
}
