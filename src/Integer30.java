import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yil = scanner.nextInt();

        int asr = (yil - 1) / 100 + 1;

        System.out.println(asr);
    }
}
