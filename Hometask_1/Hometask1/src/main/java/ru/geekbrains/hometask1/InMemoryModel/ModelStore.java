package ru.geekbrains.hometask1.InMemoryModel;

import ru.geekbrains.hometask1.ModelElements.Camera;
import ru.geekbrains.hometask1.ModelElements.Flash;
import ru.geekbrains.hometask1.ModelElements.PolygonalModel;
import ru.geekbrains.hometask1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<ModelChangedObserver> observers = new ArrayList<>();

    private List<PolygonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PolygonalModel model){
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }
}
