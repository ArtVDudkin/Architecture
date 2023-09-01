package ru.geekbrains.hometask1.InMemoryModel;

public class Observer2 implements IModelChangedObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer #2");
    }

}
