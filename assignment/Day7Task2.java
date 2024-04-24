public class KitePattern {
    public static void main(String[] args) {
        int n = 7; // Adjust the value of n for different sizes of kite

        // Upper part of the kite
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n / 2 - i || j == n / 2 + i || i == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower part of the kite
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j == n / 2 - i || j == n / 2 + i || i == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
