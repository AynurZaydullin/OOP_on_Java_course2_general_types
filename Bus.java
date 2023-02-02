package pro.sky.java.course2.transport;
// D - обобщенный (параметризованный) тип данных. Клас Bus реализует интерфейс Гонщик (соревнующийся) для Bus.
public class Bus<D extends Driver> extends Transport implements Racer{
    private D driver;
    private BusCapacity busCapacity;

    public Bus(String brand, String model, double engineVolume, D driver, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.driver = setDriver(driver);
        this.busCapacity = busCapacity;
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
    public void printType() {
        if (getBusCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(getBusCapacity());
        }
    }

    @Override
    public void executeDiagnostic() throws TransportTypeException {
        throw  new TransportTypeException("Автобусы не должны проходить диагностику.");
    }

    public D getDriver() {
        return driver;
    }

    public D setDriver(D driver) {
        return driver;
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    @Override
    public String toString() {
        return "Атобус: " + super.toString();
    }
}
