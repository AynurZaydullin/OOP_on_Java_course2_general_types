package pro.sky.java.course2.transport;

public class Driver {
    public final String lastName;
    public final String name;
    public final String middleName;
    public final String drivingLicense;
    public final int drivingExperience;

    public Driver(String lastName, String name, String middleName, String drivingLicense, int drivingExperience) {
        this.lastName = validateLastName(lastName);
        this.name = validateName(name);
        this.middleName = validateMiddleName(middleName);
        this.drivingLicense = validateDrivingLicense(drivingLicense);
        this.drivingExperience = validateDrivingExperience(drivingExperience);
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public String validateLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите фамилию.");
            lastName = "default";
        }
        return lastName;
    }
    public String validateName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите имя.");
            name = "default";
        }
        return name;
    }
    public String validateMiddleName(String middleName) {
        if (middleName == null || middleName.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите отчество.");
            middleName = "default";
        }
        return middleName;
    }
    public String validateDrivingLicense(String drivingLicense) {
        if (drivingLicense == null || drivingLicense.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите категорию водительских прав.");
            drivingLicense = "default";
        }
        return drivingLicense;
    }
    public int validateDrivingExperience(int drivingExperience) {
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
