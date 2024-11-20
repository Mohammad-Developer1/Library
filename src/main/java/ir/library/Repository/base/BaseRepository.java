package ir.library.Repository.base;

import java.io.Serializable;
import java.util.List;

public interface BaseRepository<T extends Serializable,ID extends  Number> {

    T save(T t);

    T update(T t);

    Boolean delete(ID id);

    T findID(ID id);

    List<T> findAll();

}
