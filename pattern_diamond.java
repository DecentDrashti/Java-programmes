//         * 
//       * A *
//     * B A B *
//   * C B A B C *
// * D C B A B C D *
//   * C B A B C *
//     * B A B *
//       * A *
//         *
// public class pattern_diamond{
//     public static void main(String[] args){
//         int n = 5; // Total number of rows

//         for (int i = 1; i <= n; i++) {
//             // 2. Print middle spaces
//             // The number of spaces is (n - i) * 2 - 1, except for the first row
//             // int spaces = (n - i) * 2 - 1;
//             for (int j = n; j >i; j--) {
//                 System.out.print(" ");
//             }
//             // 1. Print upside stars and characters
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             // for (int j = i-1; j >= 1; j--) {
//             //     System.out.print((char)('A' + i - j - 1) + " ");
//             // }
             


            

//             // 3. Print right stars 
//             // Avoid double-printing the first row's stars if you want a solid top line
//             // for (int j = 1; j <= i; j++) {
//             //     if (i == n && j == 1) continue; // Skip one star on the full top row
//             //     System.out.print("*");
//             // }

//             // Move to the next line
//             System.out.println();
//         }
//         for(int i=1;i<n;i++){
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(" ");
//             }
//             //print downside stars and characters
//             for (int j = n-1; j >= i; j--) {
//                 System.out.print("* ");
//             }
//             // Move to the next line
//             System.out.println();
//         }

// }}
public class pattern_diamond {
    public static void main(String[] args) {
        int n = 5; // n=5 means the middle row is the 5th row (D)

        // Upper half (Rows 0, 1, 2, 3, 4)
        // This prints from the top tip up to 'D'
        for (int i = 0; i < n; i++) {
            printLine(i, n - 1);
        }

        // Lower half (Rows 3, 2, 1, 0)
        // We start at n-2 to avoid repeating the middle 'D' row
        for (int i = n - 2; i >= 0; i--) {
            printLine(i, n - 1);
        }
    }

    private static void printLine(int i, int n) {
        // Leading spaces
        for (int s = 0; s < n - i; s++) {
            System.out.print("  ");
        }

        // Left asterisk
        System.out.print("* ");

        if (i > 0) {
            // Descending letters to 'A'
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j) + " ");
            }
            // Ascending letters back up
            for (int j = 1; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            // Right asterisk
            System.out.println("*");
        } else {
            System.out.println();
        }
    }
}

