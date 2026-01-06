package bool;

import java.util.Scanner;

public class Boolean31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = (a == b || b == c || a == c) && !(a == b && b == c);

        System.out.println(result);
    }
}
