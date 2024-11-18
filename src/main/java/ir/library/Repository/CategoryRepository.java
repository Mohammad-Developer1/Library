package ir.library.Repository;

import ir.library.Repository.base.BaseRepository;
import ir.library.model.Category;

import java.util.List;

public interface CategoryRepository extends BaseRepository<Category, Integer> {
    @Override
    Category upsert(Category category);

    @Override
    Boolean delete(Integer integer);

    @Override
    Category findID(Integer integer);

    @Override
    List<Category> findAll();
}
