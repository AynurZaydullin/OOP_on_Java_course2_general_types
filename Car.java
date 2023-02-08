package pro.sky.java.course2.transport;

import java.util.ArrayList;

// D - обобщенный (параметризованный) тип данных. Клас Car реализует интерфейс Гонщик (соревнующийся) для Car.
public class Car<D extends Driver> extends Transport implements Racer {
    private D driver;
    public CarBodyType carBodyType;

    public Car(String brand, String model, double engineVolume, D driver, CarBodyType carBodyType, ArrayList<Mechanic> mechanic) {
        super(brand, model, engineVolume, mechanic);
        this.driver = setDriver(driver);
        this.carBodyType = carBodyType;
    }
    @Override
    public void printPitStop() {
        System.out.println("Car pit-stop.");
    }

    @Override
    public void printTheBestCircleTime() {
        System.out.println("Car the best circle time.");
    }

    @Override
    public void printMaxSpeed() {
        System.out.println("Car max speed.");
    }
    @Override
    public void start() {
        System.out.println("Легковой автомобиль начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль остановил движение.");
    }

    @Override
    public void printType() {
        if (getCarBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(getCarBodyType());
        }
    }
    @Override
    public void executeDiagnostic() {
        System.out.println("Автомобиль начал проходить диагностику.");
        //Последовательно обслуживаем транпорт механиками.
        this.getMechanic().forEach(elem -> System.out.println("Механик " + elem + " провёл диагностику."));
    }

    @Override
    public boolean isDiagnosticsPermitted() {
        return true;
    }
    public D getDriver() {
        return driver;
    }

    public D setDriver(D driver) {
        return driver;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + super.toString();
    }
}
