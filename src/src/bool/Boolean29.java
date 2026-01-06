package bool;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result = (x > x1 && x < x2) && (y < y1 && y > y2);

        System.out.println(result);
    }
}
