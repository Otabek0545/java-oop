package integer;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int boshlangich = 1;
        int natija = (boshlangich + k - 1) % 7;

        System.out.println(natija);
    }
}
