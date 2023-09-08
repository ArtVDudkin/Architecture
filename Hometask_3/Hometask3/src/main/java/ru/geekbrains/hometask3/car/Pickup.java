package ru.geekbrains.hometask3.car;

import ru.geekbrains.hometask3.carwashing.CarWash;
import ru.geekbrains.hometask3.gasstation.IRefuelable;

public class Pickup extends Car implements IFuelable, IWash {

    private IRefuelable refueling;
    private CarWash carWash;
    public Pickup(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(4);
    }
    @Override
    public void move() {

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

    @Override
    public void getFuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void setRefuelingStation(IRefuelable refuelingStation) {
        this.refueling = refuelingStation;
    }

    @Override
    public void wash(String complex) {
        if (carWash != null){
            carWash.chooseComplex(complex);
        }
    }

    @Override
    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }
}
