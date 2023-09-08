package ru.geekbrains.hometask3.gasstation;

import ru.geekbrains.hometask3.car.FuelType;

public class RefuelingStation implements IRefuelable {

    private String name;
    public RefuelingStation(String name) {
        this.name = name;
    }

    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case DIESEL -> System.out.println(this.name + ": Автомобиль заправлен дизельным топливом");
            case GASOLINE -> System.out.println(this.name + ": Автомобиль заправлен бензином");
        }
    }
}
