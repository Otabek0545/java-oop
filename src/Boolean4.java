import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int a = scanner.nextInt();
        boolean result = (a > 2 && b <= 3);
        System.out.println("Boolean: " + result);
    }
}
