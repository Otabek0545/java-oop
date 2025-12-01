import java.util.Scanner;

public class Integer7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikki xonali son: ");
        int n = scanner.nextInt();

        int sum = n / 10 + n % 10;

        System.out.println("Raqamlar yig‘indisi: " + sum);
    }
}
