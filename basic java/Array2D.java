public class Array2D {
    public static void main(String[] args) {
        char[][] telephone = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };
        for (char[] row : telephone) {
            for (char num : row) {
                System.out.printf("%c ", num);
            }
            System.out.println();
        }
    }
}
