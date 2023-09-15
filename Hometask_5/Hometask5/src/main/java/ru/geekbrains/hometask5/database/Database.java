package ru.geekbrains.hometask5.database;

import ru.geekbrains.hometask5.entity.Entity;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();

    void save();

    Collection<Entity> getAll();

    void addEntity(Entity entity);

    void removeEntity(Entity entity);

}
