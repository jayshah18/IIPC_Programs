package LEC03;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    public String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
}

class Manager extends Member {
    public String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "1234567890", "123 Main St", 5000.0, "Software Engineering");
        Manager manager = new Manager("Jane Smith", 40, "9876543210", "456 Park Ave", 8000.0, "Human Resources");

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specialization: " + employee.specialization);

        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}