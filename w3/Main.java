import java.util.Scanner;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary:" + salary);
    }
}

class Employee extends Member {
    String specialization;
    String department;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization,
            String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
    }
}

class Manager extends Member {
    String specialization;
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String specialization,
            String department) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting Employee details from user
        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Age: ");
        int empAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Phone Number: ");
        String empPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String empAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Specialization: ");
        String empSpecialization = scanner.nextLine();
        System.out.print("Department: ");
        String empDepartment = scanner.nextLine();

        // Creating Employee object and printing details
        Employee emp = new Employee(empName, empAge, empPhoneNumber, empAddress, empSalary, empSpecialization,
                empDepartment);
        System.out.println("\nEmployee Details:");
        emp.printDetails();

        // Getting Manager details from user
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Phone Number: ");
        String managerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Specialization: ");
        String managerSpecialization = scanner.nextLine();
        System.out.print("Department: ");
        String managerDepartment = scanner.nextLine();

        // Creating Manager object and printing details
        Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary,
                managerSpecialization, managerDepartment);
        System.out.println("\nManager Details:");
        manager.printDetails();

        scanner.close();
    }
}
