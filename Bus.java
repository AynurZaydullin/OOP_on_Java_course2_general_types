package pro.sky.java.course2.transport;
// D - обобщенный (параметризованный) тип данных. Клас Bus реализует интерфейс Гонщик (соревнующийся) для Bus.
public class Bus<D extends Driver> extends Transport implements Racer{
    private D driver;

    public Bus(String brand, String model, double engineVolume, D driver) {
        super(brand, model, engineVolume, driver);
    }
    @Override
    public void printPitStop() {
        System.out.println("Автобус заехал на  пит-стоп.");
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
        System.out.println("Автобус начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановил движение.");
    }

    @Override
    public String toString() {
        return "Атобус: " + super.toString();
    }
}
