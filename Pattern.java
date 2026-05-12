import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        for (int i = n; i >= 1; i--) {
            // 1. Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2. Print middle spaces
            // The number of spaces is (n - i) * 2 - 1, except for the first row
            int spaces = (n - i) * 2 - 1;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Print right stars 
            // Avoid double-printing the first row's stars if you want a solid top line
            for (int j = 1; j <= i; j++) {
                if (i == n && j == 1) continue; // Skip one star on the full top row
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}