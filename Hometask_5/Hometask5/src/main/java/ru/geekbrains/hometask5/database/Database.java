package ru.geekbrains.hometask5.database;

import ru.geekbrains.hometask5.entity.Entity;
import ru.geekbrains.hometask5.entity.Model3D;
import ru.geekbrains.hometask5.entity.Texture;

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

    void addTextureToModel(Model3D model, Texture texture);

}
