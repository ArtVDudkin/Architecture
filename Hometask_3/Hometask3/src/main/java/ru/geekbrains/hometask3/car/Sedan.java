package ru.geekbrains.hometask3.car;

import ru.geekbrains.hometask3.carwashing.CarWash;
import ru.geekbrains.hometask3.gasstation.IRefuelable;

public class Sedan extends Car implements IFuelable, IWash {

    private IRefuelable refueling;
    private CarWash carWash;
    public Sedan(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(4);
    }
    @Override
    public void move() {
        System.out.println("Седан начал резво набирать скорость");
    }

    @Override
    public void maintenance() {
        System.out.println("Техобслуживание автомобиля выполнено");
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
