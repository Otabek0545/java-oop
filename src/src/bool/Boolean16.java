package bool;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        boolean result = ( a >= 10 && a < 100 );

        System.out.println(result);
    }
}
