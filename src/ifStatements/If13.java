package ifStatements;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int middle;

        if ((a > b && a < c) || (a > c && a < b)) {
            middle = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            middle = b;
        } else {
            middle = c;
        }
        System.out.println(middle);
    }
}
