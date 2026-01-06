package bool;

import java.util.Scanner;

public class Boolean9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean result = (a % 2 != 0 || b % 2 != 0);
        System.out.println("Boolean: " + result);

    }
}
