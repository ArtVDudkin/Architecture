package ru.geekbrains.hometask3.car;

import ru.geekbrains.hometask3.carwashing.CarWash;
import ru.geekbrains.hometask3.gasstation.*;

public class Harvester extends Car implements IFuelable, IWash {

    private IRefuelable refueling;
    private CarWash carWash;
    public Harvester(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(6);
    }
    @Override
    public void move() {
        System.out.println("Скребя по асфальту уборщик начал движение...");
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    /**
     * Назначить автомойку
     */
    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }

    /**
     * Назначить автозаправку
     */
    @Override
    public void setRefuelingStation(IRefuelable refuelingStation) {
        this.refueling = refuelingStation;
    }



    /**
     * Заправить автомобиль
     */
    @Override
    public void getFuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void wash(String complex) {
        if (carWash != null){
            carWash.chooseComplex(complex);
        }
    }

}
