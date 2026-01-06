package ifStatements;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = 0;

        if (a == b) {
            d = 3;
        }
        if (a == c) {
            d = 2;
        }
        if (b == c) {
            d = 1;
        }
        System.out.println(d);
    }
}
