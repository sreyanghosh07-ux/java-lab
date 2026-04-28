public class Program19 {
    int x;

    Program19() {
        x = 10;
    }

    Program19(int a) {
        x = a;
    }

    public static void main(String[] args) {
        Program19 obj1 = new Program19();
        Program19 obj2 = new Program19(20);

        System.out.println("Default: " + obj1.x);
        System.out.println("Parameterized: " + obj2.x);
    }
}