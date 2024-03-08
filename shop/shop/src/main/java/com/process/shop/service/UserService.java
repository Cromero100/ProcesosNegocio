package com.process.shop.service;

import com.process.shop.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User userUpdated, Long id);
    User getUserById(Long Id);
    List<User> findAllUsers();


}
