package integer;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int boshlangich = 4;
        int natija = (boshlangich + k - 1) % 7;

        System.out.println(natija);
    }
}
