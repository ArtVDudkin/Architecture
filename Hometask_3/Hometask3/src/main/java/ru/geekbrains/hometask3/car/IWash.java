package ru.geekbrains.hometask3.car;

import ru.geekbrains.hometask3.carwashing.CarWash;

public interface IWash {

    // помыть автомобиль
    void wash(String complex);

    // назначить автомойку
    void setCarWash(CarWash carWash);

}
