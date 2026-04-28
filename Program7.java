import java.util.Scanner;

public class Program7 {
    int a, b, c;

    Program7(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        if (a >= b && a >= c)
            System.out.println("Max: " + a);
        else if (b >= a && b >= c)
            System.out.println("Max: " + b);
        else
            System.out.println("Max: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Program7 obj = new Program7(x, y, z);
        obj.findMax();
    }
}