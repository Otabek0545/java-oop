package integer;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int yuzlik = n / 100;
        int onlar = (n / 10) % 10;
        int birlik = n % 10;

        int yigindi = yuzlik + onlar + birlik;
        System.out.println(yigindi);
    }
}
