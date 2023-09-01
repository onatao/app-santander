package com.neidev.sc.service.impl;

import com.neidev.sc.domain.model.User;
import com.neidev.sc.domain.repository.UserRepository;
import com.neidev.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    /**
     *  Injecting dependency through constructor
     *  alternative way to @Autowired
     */
    private final UserRepository repository;

    public UserServiceImplementation(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        Optional<User> optionalUser = repository.findById(user.getId());

        if (!optionalUser.isPresent())
            throw new NoSuchElementException();

        if (repository.existsByAccountNumber(
                user.getAccount()
                        .getNumber()
        )) throw new IllegalArgumentException("Account number already registered!");


        return repository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(
                    NoSuchElementException::new
                );
    }
}
