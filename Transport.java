package pro.sky.java.course2.transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    public abstract void start();  // метод "Начать движение".
    public abstract void stop();  // метод "Закончить движение".
    public abstract void printType();// метод "Печать типа транспортного средства".
    public abstract void executeDiagnostic() throws TransportTypeException;// метод "Выполнить диагностику".

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }
    public String getBrand() {
        return brand;
    }

    /*
    Модификатор доступа private позволяет защитить от изменение поле "brand"
     */
    private String setBrand(String brand) {
        if (brand ==null || brand.equals("")){
            System.out.println("Поле не может быть пустым или null. Введите фамилию.");
            brand = "default";
        }
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String setModel(String model) {
        if (model == null || model.equals("")) {
            this.model = "default";
        }
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public double setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        return engineVolume;
    }

    @Override
    public String toString() {
        return  " " + brand +
                " " + model +
                ", объем двигателя — " + engineVolume + " "
                ;
    }
}