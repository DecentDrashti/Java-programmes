//1 1 1 1 1 1 1
//2 a a a a a 2
//3 a b b b a 3
//4 a b c b a 4
//5 a b b b a 5
//6 a a a a a 6
//7 7 7 7 7 7 7
public class pattern_square {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(i + " ");
                } else {
                    System.out.print((char)('A' + Math.min(Math.min(i - 2, n - i-1), Math.min(j - 2, n - j-1))) + " ");
                }
            }
            System.out.println();
        }
    }
}