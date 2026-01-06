package ifStatements;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + "\n" + b);
        } else
            System.out.println(b + "\n" + a);
    }
}
