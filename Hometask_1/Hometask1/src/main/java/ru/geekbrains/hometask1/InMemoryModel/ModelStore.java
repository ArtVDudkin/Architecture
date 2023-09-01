package ru.geekbrains.hometask1.InMemoryModel;

import ru.geekbrains.hometask1.ModelElements.Camera;
import ru.geekbrains.hometask1.ModelElements.Flash;
import ru.geekbrains.hometask1.ModelElements.PolygonalModel;
import ru.geekbrains.hometask1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<IModelChangedObserver> observers = new ArrayList<>();

    private List<PolygonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void addModel(PolygonalModel model){
        models.add(model);
        notifyChange();
    }

    public void removeModel(PolygonalModel model){
        models.remove(model);
        notifyChange();
    }

    public void addFlash(Flash flash){
        flashes.add(flash);
        notifyChange();
    }

    public void removeFlash(Flash flash){
        flashes.remove(flash);
        notifyChange();
    }

    public void addCamera(Camera cam){
        cameras.add(cam);
        notifyChange();
    }

    public void removeCamera(Camera cam){
        cameras.remove(cam);
        notifyChange();
    }

    public void addScene(Scene scene){
        scenes.add(scene);
        notifyChange();
    }

    public void removeScene(Scene scene){
        scenes.remove(scene);
        notifyChange();
    }

    public Scene getScene(int index) {
        if(index >= 0 && index < scenes.size()) {
            return scenes.get(index);
        } else {
            throw new RuntimeException("Error: there is no scene at index " + index);
        }
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(IModelChangedObserver observer) {
        observers.add(observer);
    }

    @Override
    public void RemoveModelChanger(IModelChangedObserver observer) {
        observers.remove(observer);
    }
}
