package bool;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = (a + b == 0 || a + c == 0 || b + c == 0);

        System.out.println(result);
    }
}
