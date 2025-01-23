package com.javajedi.J04_JDBC.repository;

// J03 bölümünde yaptığımız dışında burada interface generic bir yapı oluşturacağız.

import java.util.List;

/**
 * T -> entity
 * ID ->  Long id, String uuid
 */
public interface Repository<T, ID> {
    void save(T t);
    void saveAll(List<T> t);
    void update(T t);
    void delete(ID id);
    T findById(ID id);
    List<T> findAll();


}
