package pro.sky.java.course2.transport;

import pro.sky.java.course2.transport.*;



public class Main {
    public static void main(String[] args) {
        CarDriver carDriver = new CarDriver("carDriver", "A", "A", "B", 1);
        //Создаем водителя с carDriver с категорией "C".
        TruckDriver truckDriver = new TruckDriver("truckDriver", "A", "A", "C", 1);
        //Создаем водителя с carDriver с категорией "В".
        BusDriver busDriver = new BusDriver("busDriver", "A", "A", "D", 1);
        //Создаем автомобиль с водителем категории "В" и типом кузова - "Pickup".
        Car<CarDriver> car = new Car<>("Car", "C", 2.0, carDriver, CarBodyType.Pickup);
        //Печатаем тип кузова машины
        car.printType();
        //Получаем тип грузоподъёмности, для грузовика с грузоподъёмностью 10 тонн - N2 .
        TruckLoadCapacity truckLoadCapacity = TruckLoadCapacity.getTypeOfTruckLoadCapacity(10);
        // Создаем грузовик с водителем категории "С" и с грузоподъёмностью - N2 (3.5, 12).
        Truck<TruckDriver> truck = new Truck<>("Truck", "Truck" , 2.0, truckDriver, truckLoadCapacity);
        //Печатаем грузоподъёмность грузовика.
        truck.printType();
        //Получаем тип пассажировместимости, для автобуса с количеством мест = 100 - "MEDIUM".
        BusCapacity busCapacity = BusCapacity.getTypeOfBusCapacity(100);
        /* Создаем автобус с водителем категории "D" и со средней пассажировместимостью - "MEDIUM". */
        Bus<BusDriver> bus = new Bus<>("Bus", "B", 2.0, busDriver, busCapacity);
        //Печатаем пассажировместимость.
        bus.printType();
    }
}