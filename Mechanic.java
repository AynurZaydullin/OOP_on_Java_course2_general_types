package pro.sky.java.course2.transport;

public class Mechanic {
    private String lastName;
    private String name;
    private String company;
    private Transport transport;

    public Mechanic(String lastName, String name, String company) {
        this.lastName = validateLastName(lastName);
        this.name = validateName(name);
        this.company = validateCompany(company);
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
    public String validateCompany(String name) {
        if (name == null || name.equals("")) {
            System.out.println("Поле не может быть пустым или null. Введите название компании.");
            name = "default";
        }
        return name;
    }
//    public <T extends Transport> void performSTO(T t) {
//        System.out.println(t.toString() + "обслуживается механиком " + this);
//    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void printFullName() {
        System.out.println(lastName + " " + name);
    }

    //Метод провести диагностику (провести техобслуживание) транспорта.
    public <T extends Transport> void fixTransport(T transport) {
        if(transport.isDiagnosticsPermitted() )
            System.out.println("Механик " +  this.lastName + " провёл диагностику транспорта: " + transport.toString());
        else
            System.err.println(" Автобусы не нуждаются в техобслуживании перед заездом.");
    }
    public void repairTransport(Transport transport) {
        System.out.println("Механик " + this.lastName + " " + this.name  + " ремонтирует " + transport);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}