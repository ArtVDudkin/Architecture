package ru.geekbrains.hometask5.bll;

import ru.geekbrains.hometask5.dac.DatabaseAccess;
import ru.geekbrains.hometask5.entity.Model3D;
import ru.geekbrains.hometask5.entity.Texture;

import java.util.Collection;
import java.util.Random;

/**
 * Реализация Business Logical Layer
 */
public class EditorBusinessLogicalLayer implements BusinessLogicalLayer {

    private DatabaseAccess databaseAccess;

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model : getAllModels())
            processRender(model);
    }

    @Override
    public void removeTexture(Texture texture) {
        databaseAccess.removeEntity(texture);
    }

    @Override
    public void createTexture() {
        Texture texture = new Texture();
        databaseAccess.addEntity(texture);
    }

    private Random random = new Random();

    private void processRender(Model3D model) {
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
