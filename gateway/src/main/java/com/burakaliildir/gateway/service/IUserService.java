package com.burakaliildir.gateway.service;

import com.burakaliildir.gateway.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getAll();

    Optional<User> findByUsername(String username);

    User save(User user);
}
