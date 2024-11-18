package ir.library.Repository.impl;

import ir.library.Repository.UserRepository;
import ir.library.Repository.base.BaseRepository;
import ir.library.Repository.base.baseimpl.BaseRepositoryImpl;
import ir.library.model.User;

import java.util.List;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Integer> implements UserRepository  {

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public String getFindQuery() {
        return "select u from User u";
    }
}
