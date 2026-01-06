package bool;

import java.util.Scanner;

public class Boolean39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);

        boolean result = (dx == 1 && dy == 2) || (dx == 2 && dy == 1);

        System.out.println(result);
    }
}

