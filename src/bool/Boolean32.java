package bool;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a;

        System.out.println(result);
    }
}
