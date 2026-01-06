package ifStatements;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double result;

        if (x <= 0) {
            result = -x;
        } else if (x > 0 && x < 2) {
            result = x * x;
        } else {
            result = 4;
        }
        System.out.println(result);
    }
}
