package ifStatements;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " katta " + b + " dan");
        } else
            System.out.println(b + " katta " + a + " dan");
    }
}
