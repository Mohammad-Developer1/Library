package ir.library.service.impl;

import ir.library.Repository.CategoryRepository;
import ir.library.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository cr;

    public CategoryServiceImpl(CategoryRepository cr) {
        this.cr = cr;
    }
}
