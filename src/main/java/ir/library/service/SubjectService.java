package ir.library.service;

import ir.library.model.Subject;

import java.util.List;

public interface SubjectService {

    Subject upsert(Subject subject);

    Boolean delete(Integer id);

    void printAll();

    void printAllSubjectWithBooks();
}
