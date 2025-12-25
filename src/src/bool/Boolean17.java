package bool;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        boolean result = (a >= 100 && a < 1000 && a % 2 != 0);

        System.out.println(result);
    }
}
