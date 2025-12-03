package bool;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int x = a / 100;
        int z = a % 10;

        boolean result = x == z;

        System.out.println(result);
    }
}
