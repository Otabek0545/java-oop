import java.util.Scanner;

public class Integer14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int birlik = n % 10;
        int qolgan = n / 10;

        int natija = birlik * 100 + qolgan;
        System.out.println(natija);
    }
}
