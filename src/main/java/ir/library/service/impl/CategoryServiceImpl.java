package ir.library.service.impl;

import ir.library.Repository.CategoryRepository;
import ir.library.model.Category;
import ir.library.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository cr;

    public CategoryServiceImpl(CategoryRepository cr) {
        this.cr = cr;
    }

    @Override
    public Category save(Category category) {
       if (category ==null){
           throw new NullPointerException("category is null");
       }
       return cr.save(category);
    }

    @Override
    public Category update(Category category) {
        if (category ==null){
            throw new NullPointerException("category is null");
        }
        return cr.update(category);
    }

    @Override
    public Boolean delete(Integer id) {
        if (id <=0 || id ==null){
            System.out.println("please enter the id");
        }
        return cr.delete(id);
    }

    @Override
    public void printAll() {

    }
}
