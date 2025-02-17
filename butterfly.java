
import java.util.*;

public class butterfly {
    public static void butterfly(int n) {
        // 1st half
        for(int i = 1; i <= n; i++) {
            // Left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

        // 2nd half
        for(int i = n; i >= 1; i--) {
            // Left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }

    public static void main(String args[]) {
        butterfly(5);
    }
}



