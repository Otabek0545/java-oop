package integer;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting: ");
        int n = scanner.nextInt();

        int birlik = n % 10;
        int onlik = (n / 10) % 10;

        System.out.println("Birliklar xonasi: " + birlik);
        System.out.println("O'nliklar xonasi: " + onlik);
    }
}
