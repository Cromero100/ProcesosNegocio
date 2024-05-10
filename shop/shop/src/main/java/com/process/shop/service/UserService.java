package com.process.shop.service;

import com.process.shop.model.User;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User userUpdated, Long id);
    User getUserById(@Positive Long Id);
    List<User> findAllUsers();


}
