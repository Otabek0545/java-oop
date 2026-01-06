package ifStatements;

import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ((a < b && b < c) || (a > b && b > c)) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -Math.abs(a);
            b = -Math.abs(b);
            c = -Math.abs(c);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
