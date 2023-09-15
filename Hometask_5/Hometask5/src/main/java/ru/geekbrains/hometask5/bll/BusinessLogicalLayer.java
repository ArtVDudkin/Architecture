package ru.geekbrains.hometask5.bll;

import ru.geekbrains.hometask5.entity.Model3D;
import ru.geekbrains.hometask5.entity.Texture;

import java.util.Collection;

/**
 * Интерфейс BLL (Business Logical Layer)
 */
public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();

    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);

    void renderAllModels();

}
