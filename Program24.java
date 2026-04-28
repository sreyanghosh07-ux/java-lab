class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }
}

public class Program24 {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B1", 200),
            new Book("B2", 500),
            new Book("B3", 300),
            new Book("B4", 700),
            new Book("B5", 150),
            new Book("B6", 600),
            new Book("B7", 250),
            new Book("B8", 800),
            new Book("B9", 100),
            new Book("B10", 450)
        };

        double max = books[0].price;
        String name = books[0].title;

        for (Book b : books) {
            if (b.price > max) {
                max = b.price;
                name = b.title;
            }
        }

        System.out.println("Highest price book: " + name);
    }
}