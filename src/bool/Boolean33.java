package bool;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = a + b > c && b + c > a && a + c > b;

        System.out.println(result);
    }
}

