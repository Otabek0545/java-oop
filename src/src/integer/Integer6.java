package integer;

import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikki xonali son kiriting: ");
        int n = scanner.nextInt();

        int onlik = n / 10;
        int birlik = n % 10;

        System.out.println("O‘nliklar: " + onlik);
        System.out.println("Birliklar: " + birlik);
    }
}
