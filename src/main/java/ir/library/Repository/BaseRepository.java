package ir.library.Repository;

import java.io.Serializable;
import java.util.List;

public interface BaseRepository<T extends Serializable,ID extends  Number> {

    T upsert(T t);

    Boolean delete(ID id);

    T findID(ID id);

    List<T> findAll();

}
