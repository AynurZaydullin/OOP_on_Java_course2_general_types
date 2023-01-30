package pro.sky.java.course2.transport;

public class Driver {
    final private String lastName;
    private final String name;
    private final String middleName;
    private final String drivingLicense;
    private final int drivingExperience;

    public Driver(String lastName, String name, String middleName, String drivingLicense, int drivingExperience) {
        this.lastName = setLastName(lastName);
        this.name = setName(name);
        this.middleName = setMiddleName(middleName);
        this.drivingLicense = setDrivingLicense(drivingLicense);
        this.drivingExperience = setDrivingExperience(drivingExperience);
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите фамилию.");
            lastName = "default";
        }
        return lastName;
    }

    public String getName() {
        return middleName;
    }

    public String setName(String name) {
        if (name == null || lastName.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите имя.");
            name = "default";
        }
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String setMiddleName(String middleName) {
        if (middleName == null || lastName.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите отчество.");
            middleName = "default";
        }
        return middleName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public String setDrivingLicense(String drivingLicense) {
        if (drivingLicense == null || lastName.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите категорию водительских прав.");
            drivingLicense = "default";
        }
        return drivingLicense;
    }

    public int DrivingExperience() {
        return drivingExperience;
    }

    public int setDrivingExperience(int drivingExperience) {
        if (drivingExperience < 0) {
            System.out.println("Поле не может быть пустым или null. Введите водительский стаж больше или равен 0.");
            drivingExperience = 0;
        }
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "Фамилия - " + lastName + '\'' +
                ", Имя - " + name + '\'' +
                ", Отчество - " + middleName + '\'' +
                ", категоря водительских прав - " + drivingLicense + '\'' +
                ", опыт вождения - " + drivingExperience;
    }
}
