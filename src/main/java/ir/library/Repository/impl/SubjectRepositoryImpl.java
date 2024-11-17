package ir.library.Repository.impl;

import ir.library.Repository.SubjectRepository;
import ir.library.model.Subject;

public class SubjectRepositoryImpl extends BaseRepositoryImpl<Subject,Integer> implements SubjectRepository {
    @Override
    public Class<Subject> getEntityClass() {
        return Subject.class;
    }

    @Override
    public String getFindQuery() {
        return "select s from Subject s";
    }
}
