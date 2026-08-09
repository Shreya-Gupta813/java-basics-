public class forloop {
    public static void main(String[] agrs) throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!!!!");
    }

}
