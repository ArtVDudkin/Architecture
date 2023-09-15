package ru.geekbrains.hometask5.dac;

import ru.geekbrains.hometask5.database.Entity;
import ru.geekbrains.hometask5.database.Model3D;
import ru.geekbrains.hometask5.database.Texture;

import java.util.Collection;

/**
 * Интерфейс DAC
 */
public interface DatabaseAccess {

    void addEntity(Entity entity);

    void removeEntity(Entity entity);

    Collection<Texture> getAllTextures();

    Collection<Model3D> getAllModels();

}
