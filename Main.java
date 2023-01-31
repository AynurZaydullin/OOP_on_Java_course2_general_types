package pro.sky.java.course2.transport;

public class Main {
    public static void main(String[] args) {
        //Задание 1.
        for (int i = 0; i < 4; i++) {
            //Создаем водителя с carDriver с категорией "В".
            CarDriver carDriver = new CarDriver("carDriver" + i, "A", "A", "B", 1);
            //Создаем водителя с carDriver с категорией "C".
            TruckDriver truckDriver = new TruckDriver("truckDriver" + i, "A", "A", "C", 1);
            //Создаем водителя с carDriver с категорией "В".
            BusDriver busDriver = new BusDriver("busDriver" + i, "A", "A", "D", 1);
            //Создаем автомобиль с водителем категории "В"
            Car<CarDriver> car = new Car<>("Car" + i, "C" + i, 2.0, carDriver);
            /*Если программист случайно попытается записать водителя с категорией "С" (truckDriver),
            то компилятор не даст это сделать, используя обобщенные типы(дженерики)
            Car<CarDriver> car = new Car<>("Car" + 1, "C" + 1, 2.0, truckDriver);*/
            /* Создаем грузовик с водителем категории "С".*/
            Truck<TruckDriver> truck = new Truck<>("Truck" + i, "Truck" + i, 2.0, truckDriver);
            /* Создаем автобус с водителем категории "D". */
            Bus<BusDriver> bus = new Bus<>("Bus" + i, "B" + i, 2.0, busDriver);
            printCarInfo(car);
            printTruckInfo(truck);
            printBusInfo(bus);
            /*
            Racer carRacer = new Car<>("b", "b", 2.0, carDriver);
            carRacer.printMaxSpeed();
            */
        }
    }
    // Вывод сообщения “Водитель А управляет автомобилем Б и будет участвовать в заезде”.
    private static void printCarInfo(Car transport) {
        System.out.println("Водитель: " + transport.getDriver().getLastName() + " " + "управляет автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }
    private static void printTruckInfo(Truck transport) {
        System.out.println("Водитель: " + transport.getDriver().getLastName() + " " + "управляет автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }
    private static void printBusInfo(Bus transport) {
        System.out.println("Водитель: " + transport.getDriver().getLastName() + " " + "управляет автомобилем " + transport.getBrand() +
                " и будет участвовать в заезде.");
    }
}