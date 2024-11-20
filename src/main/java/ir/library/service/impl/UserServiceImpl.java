package ir.library.service.impl;

import ir.library.Repository.UserRepository;
import ir.library.model.Subject;
import ir.library.model.User;
import ir.library.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository ur;

    public UserServiceImpl(UserRepository ur) {
        this.ur = ur;
    }

    @Override
    public User save(User user) {
        if (user == null) {
            throw new NullPointerException("user is null");
        }
        return ur.save(user);
    }

    @Override
    public User update(User user) {
        if (user == null) {
            throw new NullPointerException("user is null");
        }
        return ur.update(user);
    }

    @Override
    public Boolean delete(Integer id) {
        if (id <= 0 || id == null) {
            System.out.println("please enter the id");
        }
        return ur.delete(id);
    }

    @Override
    public void printAll() {
        try {
            List<User> users = ur.findAll();
            System.out.format("\033[1;35m" + "+------+----------------+---------------+--------------+------------+%n");
            System.out.format("\033[1;35m" + "| ID   | first name     | last name     |  BirthDate   |  Password  |%n");
            System.out.format("\033[1;35m" + "+------+----------------+---------------+--------------+------------+%n");
            for (User user : users) {
                System.out.printf("\033[1;35m" + "|" + "\033[1;34m" + " %-4s" + "\033[1;35m" + " |" + "\033[1;34m" + " %-14s" + "\033[1;35m" + " |" + "\033[1;34m" + " %-13s" + "\033[1;35m" + " |" + "\033[1;34m" + " %-13s" + "\033[1;35m" + " |" + "\033[1;34m" + " %-10s" + "\033[1;35m" + "|" + "\n",
                        user.getId(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getBirthDate(),
                        user.getPassword());

            }
            System.out.format("\033[1;35m" + "+------+----------------+---------------+-----------------+---------+%n");

        } catch (Exception e) {
            System.out.println("there is problem with connecting to database");
        }
        System.out.println("\033[0m");
    }
}
