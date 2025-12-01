import java.util.Scanner;

public class Integer13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int yuzlik = n / 100;
        int qolgan = n % 100;

        int natija = qolgan * 10 + yuzlik;
        System.out.println(natija);
    }
}
