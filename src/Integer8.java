import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikki xonali son kiriting: ");
        int n = scanner.nextInt();

        int yangi = (n % 10) * 10 + (n / 10);

        System.out.println("O'rni almashgan son: " + yangi);
    }
}

