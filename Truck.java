package pro.sky.java.course2.transport;
// D - обобщенный (параметризованный) тип данных. Клас Truck реализует интерфейс Гонщик (соревнующийся) для Truck.
public class Truck<D extends Driver> extends Transport implements Racer{
    private D driver;
    public Truck(String brand, String model, double engineVolume, D driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void printPitStop() {
        System.out.println("Грузовик ");
    }

    @Override
    public void printTheBestCircleTime() {
        System.out.println("Лучшее время круга для автобуса: ");
    }

    @Override
    public void printMaxSpeed() {
        System.out.println("Максимальная скорость автобуса: ");
    }
    @Override
    public void start() {
        System.out.println("Грузовик начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановил движение.");
    }

    @Override
    public String toString() {
        return "Грузовик: " + super.toString();
    }
}
