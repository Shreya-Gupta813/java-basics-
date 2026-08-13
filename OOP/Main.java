public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(3);
        Triangle t = new Triangle(4, 5);
        Rectangle r = new Rectangle(6, 7);
        System.out.printf("%.2f%n", c.area());
        System.out.printf("%.2f%n", t.area());
        System.out.printf("%.2f%n", r.area());

    }
}