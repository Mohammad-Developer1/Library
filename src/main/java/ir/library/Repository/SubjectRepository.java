package ir.library.Repository;

import ir.library.Repository.base.BaseRepository;
import ir.library.model.Subject;

import java.util.List;

public interface SubjectRepository extends BaseRepository<Subject, Integer> {
    @Override
    Subject upsert(Subject subject);

    @Override
    Boolean delete(Integer id);

    @Override
    Subject findID(Integer integer);

    @Override
    List<Subject> findAll();


}
