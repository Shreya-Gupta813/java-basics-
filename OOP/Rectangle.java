public class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    double area() {
        return length * breadth;
    }
}
