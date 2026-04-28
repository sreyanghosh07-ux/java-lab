interface Gross {
    void calculate(double basic);
}

class EmployeeG implements Gross {
    public void calculate(double basic) {
        double gross = basic + 0.2 * basic + 0.1 * basic;
        System.out.println("Gross Salary: " + gross);
    }
}

public class Program31 {
    public static void main(String[] args) {
        EmployeeG e = new EmployeeG();
        e.calculate(50000);
    }
}