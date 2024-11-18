package ir.library.Repository.impl;

import ir.library.Repository.CategoryRepository;
import ir.library.Repository.base.baseimpl.BaseRepositoryImpl;
import ir.library.model.Category;

public class CategoryRepositoryImpl extends BaseRepositoryImpl<Category,Integer> implements CategoryRepository {
    @Override
    public Class<Category> getEntityClass() {
        return Category.class;
    }

    @Override
    public String getFindQuery() {
        return "select c from Category c";
    }
}
