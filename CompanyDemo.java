class Employee {
    String name, address, jobTitle;
    double salary;
 
    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println("Bonus of " + name + " : " + bonus);
    }

    void generatePerformanceReport() {
        System.out.println("Performance report of " + name + " (" + jobTitle + ")");
    }

    void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println("Manager Bonus of " + name + " : " + bonus);
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    void calculateBonus() {
        double bonus = salary * 0.15;
        System.out.println("Developer Bonus of " + name + " : " + bonus);
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    void calculateBonus() {
        double bonus = salary * 0.12;
        System.out.println("Programmer Bonus of " + name + " : " + bonus);
    }
}

public class CompanyDemo {
    public static void main(String[] args) {

        Manager m = new Manager("Rahul", "Mumbai", 80000);
        Developer d = new Developer("Sneha", "Pune", 60000);
        Programmer p = new Programmer("Amit", "Delhi", 50000);

        m.calculateBonus();
        m.generatePerformanceReport();
        m.manageProject();

        d.calculateBonus();
        d.generatePerformanceReport();
        d.manageProject();

        p.calculateBonus();
        p.generatePerformanceReport();
        p.manageProject();
    }
}