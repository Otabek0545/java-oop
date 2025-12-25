package integer;

import java.util.Scanner;

public class Integer9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Uch xonali son kiriting: ");
        int n = scanner.nextInt();

        int yuzlar = n / 100;

        System.out.println("Yuzlar xonasi: " + yuzlar);
    }
}
