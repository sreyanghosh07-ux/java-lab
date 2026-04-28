class TollBooth {
    int totalCars = 0;
    int paidCars = 0;
    int amount = 0;

    void payingCar() {
        totalCars++;
        paidCars++;
        amount += 50;
    }

    void nonPayingCar() {
        totalCars++;
    }

    void display() {
        System.out.println("Total cars: " + totalCars);
        System.out.println("Cars not paid: " + (totalCars - paidCars));
        System.out.println("Amount collected: " + amount);
    }
}

public class Program27 {
    public static void main(String[] args) {
        TollBooth t = new TollBooth();

        t.payingCar();
        t.payingCar();
        t.nonPayingCar();

        t.display();
    }
}