package pro.sky.java.course2.transport;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //Создаем объекты - механики.
        Mechanic mechanic1 = new Mechanic("Mechanic1", "M1", "company1");
        Mechanic mechanic2 = new Mechanic("Mechanic2", "M2", "company2");
        Mechanic mechanic3 = new Mechanic("Mechanic3", "M3", "company3");
        //Создаём список механиков и добавляет туда созданных механиков.
        ArrayList<Mechanic> mechanicArrayList = new ArrayList<>(10);
        Collections.addAll(mechanicArrayList, mechanic1, mechanic2, mechanic3 );
        //Создаём водителей для автомобилей.
        CarDriver carDriver1 = new CarDriver("carDriver1", "A", "A", "B", 1);
        CarDriver carDriver2 = new CarDriver("carDriver2", "A", "A", "B", 1);
        CarDriver carDriver3 = new CarDriver("carDriver3", "A", "A", "B", 1);
        //Создаем водителей для гузовиков с категорией "C".
        TruckDriver truckDriver1 = new TruckDriver("truckDriver1", "A", "A", "C", 1);
        TruckDriver truckDriver2 = new TruckDriver("truckDriver2", "A", "A", "C", 1);
        TruckDriver truckDriver3 = new TruckDriver("truckDriver3", "A", "A", "C", 1);
        //Создаем водителей для автобусов с категорией "В".
        BusDriver busDriver1 = new BusDriver("busDriver1", "A", "A", "D", 1);
        BusDriver busDriver2 = new BusDriver("busDriver2", "A", "A", "D", 1);
        BusDriver busDriver3 = new BusDriver("busDriver3", "A", "A", "D", 1);

        TruckLoadCapacity truckLoadCapacity = TruckLoadCapacity.getTypeOfTruckLoadCapacity(10);
        // Создаем грузовики с водителями категории "С" и с грузоподъёмностью - N2 (3.5, 12).
        Truck<TruckDriver> truck1 = new Truck<>("Truck1", "Truck" , 2.0, truckDriver1, truckLoadCapacity, mechanicArrayList);
        Truck<TruckDriver> truck2 = new Truck<>("Truck2", "Truck" , 2.0, truckDriver2, truckLoadCapacity, mechanicArrayList);
        Truck<TruckDriver> truck3 = new Truck<>("Truck3", "Truck" , 2.0, truckDriver3, truckLoadCapacity, mechanicArrayList);
        //Получаем тип пассажировместимости, для автобуса с количеством мест = 100 - "MEDIUM".
        BusCapacity busCapacity = BusCapacity.getTypeOfBusCapacity(100);
        /* Создаем автобус с водителем категории "D" и со средней пассажировместимостью - "MEDIUM". */
        Bus<BusDriver> bus1 = new Bus<>("Bus1", "B", 2.0, busDriver1, busCapacity, mechanicArrayList);
        Bus<BusDriver> bus2 = new Bus<>("Bus2", "B", 2.0, busDriver2, busCapacity, mechanicArrayList);
        Bus<BusDriver> bus3 = new Bus<>("Bus3", "B", 2.0, busDriver3, busCapacity, mechanicArrayList);

        //Создаем список автоболилей и заполняем его автомобилями.
        ArrayList<Car> carArrayList = new ArrayList<>(10);
        for (int i = 0; i < 3; i++) {
            carArrayList.add(new Car<>("Car"+i, "C", 1.8, carDriver1, CarBodyType.Pickup, mechanicArrayList));
        }
        ArrayList<Truck> truckArrayList = new ArrayList<>();
        //Создаем список грузовиков и заполняем его грузовиками.
        Collections.addAll(truckArrayList, truck1, truck2, truck3 );
        //Создаем список автобусов и заполняем его автобусами.
        ArrayList<Bus> busArrayList = new ArrayList<>();
        Collections.addAll(busArrayList, bus1, bus2, bus3 );
        //Печатаю фамилию и имя механика с порядковым номером "0"
        mechanicArrayList.get(0).printFullName();
        //Печатаю список механиков автомобиля с порядковым номером "0"
        System.out.println(carArrayList.get(0).getMechanic());
        //Создаю станцию техобслуживания.
        TransportServiceStation transportServiceStation = new TransportServiceStation();
        //Добавляю в очередь первый транспорт - это автомобиль с номером "0".
        transportServiceStation.addTransportInQueue(carArrayList.get(0));
        //Добавляю в очередь второй транспорт - это автобус с номером "1".
        //Так как это автобус, то автобус не пройдет техосмотр (диагностику) и выведется сообщение об ошибке.
        transportServiceStation.addTransportInQueue(busArrayList.get(1));
        //Добавляю в очередь третий транспорт - это автомобиль с номером "2".
        transportServiceStation.addTransportInQueue(carArrayList.get(2));
        //Проводится диагностика (техобслуживание)  автомобиля с порядковым номером "1"
        carArrayList.get(1).executeDiagnostic();
        //Механик проводит диагностику (техобслуживание) выбранного транспорта.
        mechanic1.fixTransport(carArrayList.get(0));
        //Проводится диагностика транспорта, который находится в очереди
        transportServiceStation.transportService();
        //Механик с порядковым номером "0" чинит машину с порядковым номером "2".
        mechanicArrayList.get(0).repairTransport(carArrayList.get(2));

        // --------Задание из раздела Map, HashMap----------
        // Создаю ассоциативный словарь с помощью HashMap.
        HashMap<Car, ArrayList<Mechanic>> carDriverHashMap = new HashMap<>();
        // С помощью цикла заполняю словарь HashMap ключами (автомобилями из списка) и значениями (списком механиков).
        for (int i = 0; i < carArrayList.size(); i++)
            carDriverHashMap.put(carArrayList.get(i), mechanicArrayList);
        // Вывожу в консоль элементы словаря с помощью цикла for each.
        for (Car item : carDriverHashMap.keySet())
            System.out.println(item + ": " + carDriverHashMap.get(item));
        // Сначала получается множество с ключами. Затем на каждой итерации через переменную item доступен ключ,
        // с помощью которого можно получить связанное с ним значение, передав ключ методу get().

        // -------Задание из раздела Set, Iterator -------
        System.out.println();
        System.out.println("Задание из раздела Set, Iterator.");
        // Создаю множество водителей, используя конструктор класса HashSet.
        HashSet<CarDriver> nameSet = new HashSet<CarDriver>();
        // Добавляют в множество водителей, причём первого водителя я добавляю два раза.
        Collections.addAll(nameSet,carDriver1, carDriver1, carDriver2, carDriver3);
        // Однако в множестве не будут храниться повторяющиеся элементы. Поэтому будут выводиться только
        // уникальные элементы.
        //Вывожу водителей в консоль, используя итерратор.
        Iterator<CarDriver> iterator = nameSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}