package ru.kata.spring.boot_security.demo.service;



import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    public User findBuId(Long id);

    public List<User> findAll();

    public User saveUser(User user);

    public void deleteById(Long id);

}
