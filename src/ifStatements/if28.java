package ifStatements;

import java.util.Scanner;

public class if28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int result;

        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            result = 366;
        } else {
            result = 365;
        }
        System.out.println(result);
    }
}
