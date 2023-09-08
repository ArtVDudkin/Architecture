package ru.geekbrains.hometask3.gasstation;

import ru.geekbrains.hometask3.car.FuelType;

public interface IRefuelable {

    /**
     * Заправка
     */
    void fuel(FuelType fuelType);
}
