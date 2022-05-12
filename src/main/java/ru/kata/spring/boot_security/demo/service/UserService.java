package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User findEmail(String email);

    void update(User user, int id, String[] roles, String pass);

    void delete(int id);

    void save(User user, String[] roles, String pass);

    User findUser(int id);
}