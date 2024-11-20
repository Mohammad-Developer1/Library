package ir.library.service;

import ir.library.model.Category;
import ir.library.model.User;

public interface CategoryService {
    Category save(Category category);

    Category update(Category category);

    Boolean delete(Integer id);

    void printAll();
}
