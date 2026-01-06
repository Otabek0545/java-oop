package ifStatements;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = Math.min(a,Math.min(b,c));
        int max = Math.max(a,Math.max(b,c));

        System.out.println(min);
        System.out.println(max);
    }
}
