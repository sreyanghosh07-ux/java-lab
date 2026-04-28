abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double price;

    void display() {
        System.out.println(modelName + " " + modelNumber + " " + price);
    }
}

class Car extends MotorVehicle {
    double discountRate = 10;

    void discount() {
        double discount = price * discountRate / 100;
        System.out.println("Discount: " + discount);
    }
}

public class Program36 {
    public static void main(String[] args) {
        Car c = new Car();
        c.modelName = "Swift";
        c.modelNumber = 101;
        c.price = 500000;

        c.display();
        c.discount();
    }
}