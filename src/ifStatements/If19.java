package ifStatements;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int n = 0;

        if (a == b && b == c) {
            n = 4;
        }
        if (a == b && b == d) {
            n = 3;
        }
        if (a == c && c == d) {
            n = 2;
        }
        if (b == c && c == d) {
            n = 1;
        }
        System.out.println(n);
    }
}
