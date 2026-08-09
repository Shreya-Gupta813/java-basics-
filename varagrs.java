public class varagrs {
    public static void main(String[] args) {
        System.out.printf("%.2f", avg(1.3, 2.4, 3.6, 4.3, 5.2));
    }

    static double avg(double... numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
