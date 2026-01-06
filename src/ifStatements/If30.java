package ifStatements;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x >= 1 && x <= 9) {
            if (x % 2 == 0)
                System.out.println("1 xonali juft son!");
            else
                System.out.println("1 xonali toq son!");
        } else if (x >= 10 && x <= 99) {
            if (x % 2 == 0)
                System.out.println("2 xonali juft son!");
            else
                System.out.println("2 xonali toq son!");
        } else if (x >= 100 && x <= 999) {
            if (x % 2 == 0)
                System.out.println("3 xonali juft son!");
            else
                System.out.println("3 xonali toq son!");
        } else {
            System.out.println("Bu son 1–3 xonali emas!");
        }
    }
}
