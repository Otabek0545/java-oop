package ifStatements;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = 0;

        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;

        System.out.println("Musbat sonlar soni: " + count);
    }
}
