public class Program18 {
    int x;

    // Parameterized constructor
    Program18(int a) {
        x = a;
    }

    public static void main(String[] args) {
        Program18 obj = new Program18(50);
        System.out.println("Value: " + obj.x);
    }
}