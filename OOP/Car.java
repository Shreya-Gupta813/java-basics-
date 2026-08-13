public class Car {
    int year = 2025;
    String make = "Ford";
    String model = "Mustang";
    boolean isRunning = false;
    double price;

    Car() {
        this.make = "Unknown";
        this.model = "Unknown";
    }

    Car(String make, String model) {
        this.make = make;
        this.model = "Unknown";
        this.price = 0.00;
    }

    Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    void start() {
        System.out.println(this.make + " Engine Started");    }
}
