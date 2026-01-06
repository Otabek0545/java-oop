package ifStatements;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x % 2 == 1) {
            System.out.println("Musbat toq son!");
        } else if (x > 0 && x % 2 == 0) {
            System.out.println("Musbat juft son!");
        } else if (x % 2 == -1) {
            System.out.println("Manfiy toq son!");
        } else if (x < 0) {
            System.out.println("Manfiy juft son!");
        } else {
            System.out.println("Son nolga teng!");
        }
    }
}
