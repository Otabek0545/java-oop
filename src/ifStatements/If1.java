package ifStatements;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a > 0) {
            a = a + 1;
            System.out.println(a);
        }
    }
}
