package ru.geekbrains.hometask1.InMemoryModel;

public interface IModelChanger {

    /**
     * Произошло изменение в хранилище моделей
     */
    void notifyChange();

    void RegisterModelChanger(IModelChangedObserver o);
    void RemoveModelChanger(IModelChangedObserver o);

}
