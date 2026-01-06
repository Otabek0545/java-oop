package ifStatements;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max1 = Math.max(a, b);
        int max2 = Math.max(b, c);

        System.out.println("" + max1 + "\n" + max2 + "");
    }
}
