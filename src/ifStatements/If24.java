package ifStatements;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double result;

        if (x > 0) {
            result = 2 * Math.sin(x);
        } else {
            result = x - 6;
        }
        System.out.println(result);
    }
}
