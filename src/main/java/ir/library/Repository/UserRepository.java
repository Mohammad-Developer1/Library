package ir.library.Repository;

import ir.library.Repository.base.BaseRepository;
import ir.library.model.User;

import java.util.List;

public interface UserRepository extends BaseRepository<User,Integer> {
    @Override
    User upsert(User user);

    @Override
    Boolean delete(Integer integer);

    @Override
    User findID(Integer integer);

    @Override
    List<User> findAll();
}
