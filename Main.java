package pro.sky.java.course2.transport;

import pro.sky.java.course2.transport.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1.
        for (int i = 0; i < 4; i++) {
            //Создаем водителя с carDriver с категорией "В".
            CarDriver carDriver = new CarDriver("carDriver" + i, "A", "A", "B", 1);
            //Создаем водителя с carDriver с категорией "C".
            TruckDriver truckDriver= new TruckDriver("truckDriver" + i, "A", "A", "C", 1);
            //Создаем водителя с carDriver с категорией "В".
            BusDriver busDriver = new BusDriver("busDriver" + i, "A", "A", "D", 1);
            Transport<CarDriver> car = new Car<>("Car" + i, "C" + i, 2.0, carDriver);
            Transport<TruckDriver> truck = new Truck<>("Car" + i, "Truck" + i, 2.0, truckDriver);
            Transport<BusDriver> bus = new Bus<>("Bus" + i, "B" + i, 2.0, busDriver);
            printInfo(car);
            printInfo(truck);
            printInfo(bus);
            /*
            Racer carRacer = new Car<>("b", "b", 2.0, carDriver);
            carRacer.printMaxSpeed();
            */
        }
    }
    // Вывод сообщения “Водитель А управляет автомобилем Б и будет участвовать в заезде”.
    private static void printInfo(Transport<?>  transport) {
        System.out.println("Водитель: " + transport.getDriver().getLastName() + " " + "управляет автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }
}