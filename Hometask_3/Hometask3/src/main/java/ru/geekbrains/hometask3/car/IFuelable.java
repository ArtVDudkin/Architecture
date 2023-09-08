package ru.geekbrains.hometask3.car;

import ru.geekbrains.hometask3.gasstation.IRefuelable;

public interface IFuelable {

    // заправить автомобиль
    void getFuel();

    // назначить автозаправку
    void setRefuelingStation(IRefuelable refuelingStation);

}
