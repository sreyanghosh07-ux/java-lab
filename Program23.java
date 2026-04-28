class Employee {
    String name, department;
    double salary;
    static String company = "ABC Pvt Ltd";

    Employee(String n, String d, double s) {
        name = n;
        department = d;
        salary = s;
    }

    void display() {
        System.out.println(name + " | " + department + " | " + salary + " | " + company);
    }
}

public class Program23 {
    public static void main(String[] args) {
        Employee e1 = new Employee("A", "IT", 50000);
        Employee e2 = new Employee("B", "HR", 40000);
        Employee e3 = new Employee("C", "Sales", 45000);
        Employee e4 = new Employee("D", "IT", 55000);
        Employee e5 = new Employee("E", "HR", 48000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}