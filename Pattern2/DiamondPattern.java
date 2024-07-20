package Pattern2;

public class DiamondPattern {
    public static void Diamond(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();

        } // second half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Diamond(4);
    }
}
