package ir.library.service;

import ir.library.model.Book;
import ir.library.model.User;

public interface BookService {
    Book save(Book book);

    Book update(Book book);

    Boolean delete(Integer id);

    void printAll();
}
