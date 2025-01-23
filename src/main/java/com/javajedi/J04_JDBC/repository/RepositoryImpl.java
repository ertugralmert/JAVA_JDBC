package com.javajedi.J04_JDBC.repository;

import java.util.List;

public class RepositoryImpl<T,ID> implements Repository<T,ID>{
    /**
     * Java Reflection: Java sınıflarını tersine mühendislik ile
     * okuyabilir ve içerisindeki bilgilere ulaşabiliriz.
     *
     */


    @Override
    public void save(T t) {

    }

    @Override
    public void saveAll(List<T> t) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }
}
