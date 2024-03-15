package com.process.shop.service;

import com.process.shop.model.Address;
import com.process.shop.model.Enum.DocumentType;
import com.process.shop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User userUpdated, Long id) {
        return null;
    }

    @Override
    public User getUserById(Long Id) {
        return User.builder().fullName("Cristian Romero")
                .mail("cfromerop@ufpso")
                .documentTypeType(DocumentType.CC)
                .cc("1005384346")
                .address(List.of(Address.builder()
                                .number("123")
                                .street("calle siempreviva")
                                .neighborhood("neighborhood").build(),
                        Address.builder()
                                .number("321")
                                .street("calle siempremuerta")
                                .neighborhood("borhoodneigh").build())).build();
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
