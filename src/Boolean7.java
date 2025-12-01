import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean result = (b > a && b < c) || (b < a && b > c);
        System.out.println("Boolean: " + result);
    }
}
