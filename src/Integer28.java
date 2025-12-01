import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int boshlangich = n % 7;
        int result = (boshlangich + k - 1) % 7;

        System.out.println(result);
    }
}
