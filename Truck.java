package pro.sky.java.course2.transport;
// D - обобщенный (параметризованный) тип данных. Клас Truck реализует интерфейс Гонщик (соревнующийся) для Truck.
public class Truck<D extends Driver> extends Transport implements Racer{
    private D driver;
    private TruckLoadCapacity truckLoadCapacity;
    public Truck(String brand, String model, double engineVolume, D driver, TruckLoadCapacity truckLoadCapacity) {
        super(brand, model, engineVolume);
        this.driver = setDriver(driver);
        this.truckLoadCapacity = truckLoadCapacity;
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
    public void printType() {
        if (getTruckLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(getTruckLoadCapacity());
        }
    }

    @Override
    public void executeDiagnostic() {
        System.out.println("Грузовик начал проходить диагностику.");
    }

    public D getDriver() {
        return driver;
    }

    public D setDriver(D driver) {
        return driver;
    }

    public TruckLoadCapacity getTruckLoadCapacity() {
        return truckLoadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик: " + super.toString();
    }
}
