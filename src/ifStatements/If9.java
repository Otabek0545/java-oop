package ifStatements;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();

        if (a >= b) {
            double max = a;
            a = b;
            b = max;
            System.out.println("a = " + a + "\nb = " + b);
        }
    }
}
