class Emp {
    int emp_no;
    String name, dept;
    double basic, DA, HRA, gross;

    Emp(int e, String n, String d, double b) {
        emp_no = e;
        name = n;
        dept = d;
        basic = b;

        DA = 0.2 * basic;
        HRA = 0.1 * basic;
        gross = basic + DA + HRA;
    }
}

public class Program26 {
    public static void main(String[] args) {
        Emp[] e = {
            new Emp(1, "A", "IT", 50000),
            new Emp(2, "B", "HR", 60000),
            new Emp(3, "C", "Sales", 55000)
        };

        double max = e[0].gross;
        String name = e[0].name;

        for (Emp x : e) {
            if (x.gross > max) {
                max = x.gross;
                name = x.name;
            }
        }

        System.out.println("Highest salary employee: " + name);
    }
}