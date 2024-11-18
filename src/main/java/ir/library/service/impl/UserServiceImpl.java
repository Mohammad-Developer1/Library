package ir.library.service.impl;

import ir.library.Repository.UserRepository;
import ir.library.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository ur;

    public UserServiceImpl(UserRepository ur) {
        this.ur = ur;
    }
}
