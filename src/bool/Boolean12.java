package bool;

import java.util.Scanner;

public class Boolean12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = (a > 0 && b > 0 && c > 0);

        System.out.println(result);
    }
}
