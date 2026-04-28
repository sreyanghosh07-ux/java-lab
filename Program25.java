class Book2 {
    String title;
    double price;

    Book2(String t, double p) {
        title = t;
        price = p;
    }
}

public class Program25 {
    public static void main(String[] args) {
        Book2[] b = {
            new Book2("A", 200),
            new Book2("B", 800),
            new Book2("C", 500),
            new Book2("D", 300)
        };

        double max = b[0].price;
        String name = b[0].title;

        for (Book2 x : b) {
            if (x.price > max) {
                max = x.price;
                name = x.title;
            }
        }

        System.out.println("Highest price book: " + name);
    }
}