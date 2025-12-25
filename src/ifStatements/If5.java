package ifStatements;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int positive = 0;
        int negative = 0;

        if (a > 0) positive++;
        else if (a < 0) negative++;

        if (b > 0) positive++;
        else if (b < 0) negative++;

        if (c > 0) positive++;
        else if (c < 0) negative++;

        System.out.println("Musbat sonlar soni: " + positive);
        System.out.println("Manfiy sonlar soni: " + negative);

    }
}
