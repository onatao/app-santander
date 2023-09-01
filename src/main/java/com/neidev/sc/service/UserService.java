package com.neidev.sc.service;

import com.neidev.sc.domain.model.User;

import java.util.Optional;

public interface UserService {


    User create(User user);

    void deleteById(Long id);

    User findById(Long id);


}
