package ir.library.service;

import ir.library.model.Subject;
import ir.library.model.User;

public interface UserService {
    User save(User user);

    User update(User user);

    Boolean delete(Integer id);

    void printAll();
}
