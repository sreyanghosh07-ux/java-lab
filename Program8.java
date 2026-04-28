public class Program8 {
    int a, b;

    Program8(int x, int y) {
        a = x;
        b = y;
    }

    void swap() {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Program8 obj = new Program8(10, 20);

        System.out.println("Before swap: a = " + obj.a + ", b = " + obj.b);
        obj.swap();
    }
}