package pro.sky.java.course2.transport;

// D - обобщенный (параметризованный) тип данных. Клас Car реализует интерфейс Гонщик (соревнующийся) для Car.
public class Car<D extends Driver> extends Transport implements Racer {

    public Car(String brand, String model, double engineVolume, D driver) {
        super(brand, model, engineVolume, driver);
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
    public String toString() {
        return "Легковой автомобиль: " + super.toString()
                ;
    }
}
