import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("M (kg) ni kiriting: ");
        int m = scanner.nextInt();

        int tonna = m / 1000;

        System.out.println("To‘liq tonnalar: " + tonna);
    }
}
