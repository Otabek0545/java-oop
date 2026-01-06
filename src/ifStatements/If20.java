package ifStatements;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int m = Math.abs(a - b);
        int n = Math.abs(a - c);

        if (m < n) {
            System.out.println("" + b + "\n" + m);
        }else
        System.out.println("" + c + "\n" + n);
    }
}
