import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int yuzlik = (n / 100) % 10;
        System.out.println(yuzlik);
    }
}
