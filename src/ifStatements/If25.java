package ifStatements;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double result;

        if (x < -2 || x > 2) {
            result = 2 * x;
        } else {
            result = -3 * x;
        }
        System.out.println(result);
    }
}
