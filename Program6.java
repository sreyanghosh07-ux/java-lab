import java.util.Scanner;

public class Program6 {
    int num;

    Program6(int n) {
        num = n;
    }

    void check() {
        if (num >= 0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Program6 obj = new Program6(n);
        obj.check();
    }
}