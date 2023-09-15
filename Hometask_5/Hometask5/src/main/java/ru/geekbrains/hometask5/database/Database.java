package ru.geekbrains.hometask5.database;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();

    void save();

    Collection<Entity> getAll();

}
