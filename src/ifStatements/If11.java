package ifStatements;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a != b) {
            int max = Math.max(a,b);
            a = max;
            b = max;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("a = " + a + "\nb = " + b);

    }
}
