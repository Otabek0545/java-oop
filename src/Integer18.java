import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int minglik = (n / 1000) % 10;
        System.out.println(minglik);
    }
}
