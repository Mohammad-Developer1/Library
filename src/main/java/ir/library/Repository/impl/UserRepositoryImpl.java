package ir.library.Repository.impl;

import ir.library.Repository.UserRepository;
import ir.library.Repository.base.BaseRepository;
import ir.library.Repository.base.baseimpl.BaseRepositoryImpl;
import ir.library.model.User;
import jakarta.persistence.EntityManager;

import static ir.library.util.EntityManagerProvider.*;
import java.util.List;

public class UserRepositoryImpl extends BaseRepositoryImpl<User,Integer> implements UserRepository  {

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }


    @Override
    public User update(User user) {
       EntityManager em = getEntityManager();
       try {
           em.getTransaction().begin();
           User findId =findID(user.getId());
           findId.setFirstName(user.getFirstName());
           findId.setLastName(user.getLastName());
           findId.setBirthDate(user.getBirthDate());
           findId.setPassword(user.getPassword());
           em.getTransaction().commit();
       }catch(Exception e) {
           em.getTransaction().rollback();
       }
       return user;
    }
}
