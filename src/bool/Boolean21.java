package bool;

import java.util.Scanner;

public class Boolean21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int x = a / 100;
        int y = (a / 10) % 10;
        int z = a % 10;

        boolean result = x < y && y < z;

        System.out.println(result);
    }
}
