package ru.geekbrains.hometask3;

import ru.geekbrains.hometask3.car.*;
import ru.geekbrains.hometask3.carwashing.CarWash;
import ru.geekbrains.hometask3.gasstation.RefuelingStation;

import java.util.ArrayList;
import java.util.List;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     *  быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     *  топлива, тип коробки передач, объём двигателя; методы:
     *  движение, обслуживание, переключение передач, включение
     *  фар, включение дворников.
     *
     * 2. Создать конкретный автомобиль путём наследования класса
     *  «Car».
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     *
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     *
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     *
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     *
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     *
     *
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     *
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
     *
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     *
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.
     *
     * @param args
     */
    public static void main(String[] args) {

        RefuelingStation refuelingStation1 = new RefuelingStation("AZS-1");
        RefuelingStation refuelingStation2 = new RefuelingStation("AZS-2");

        CarWash carWash1 = new CarWash("CarWash-1");
        CarWash carWash2 = new CarWash("CarWash-2");

        List<Car> garage = new ArrayList<>();
        garage.add(new Harvester("Egholm", "City Ranger 2260", Color.GREEN, FuelType.DIESEL));
        garage.add(new Truck("KamAZ", "5320", Color.BLUE, FuelType.DIESEL));
        garage.add(new Sedan("GAZ", "24", Color.BLACK,FuelType.GASOLINE));
        garage.add(new Sportcar("Talon motors", "Invader",Color.ORANGE,FuelType.GASOLINE));
        garage.add(new Pickup("Ford", "F-150",Color.RED,FuelType.DIESEL));

        System.out.println("Заправляем авто:");
        for(Car car : garage) {
            System.out.println(car.getMake() + " " + car.getModel() + ":");
            if(garage.indexOf(car) % 2 ==0) {
                if(car instanceof IFuelable) {
                    ((IFuelable) car).setRefuelingStation(refuelingStation1);
                    ((IFuelable) car).getFuel();
                }
            } else {
                if(car instanceof IFuelable) {
                    ((IFuelable) car).setRefuelingStation(refuelingStation2);
                    ((IFuelable) car).getFuel();
                }
            }
            System.out.println("---------------------------");
        }
        System.out.println();
        System.out.println("Направляем автомобили на мойку:");
        for(Car car : garage) {
            System.out.println(car.getMake() + " " + car.getModel() + ":");
            if(garage.indexOf(car) % 2 ==0) {
                if(car instanceof IWash) {
                    ((IWash) car).setCarWash(carWash1);
                    ((IWash) car).wash("complex1");
                }
            } else {
                if(car instanceof IWash) {
                    ((IWash) car).setCarWash(carWash2);
                    ((IWash) car).wash("complex2");
                }
            }
            System.out.println("---------------------------");
        }

    }

}
