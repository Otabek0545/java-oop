import java.util.Scanner;

public class Task2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1-son: ");
        int num1 = scanner.nextInt();

        System.out.print("2-son: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " katta " + num2 + " dan");
        } else if (num2 > num1) {
            System.out.println(num2 + " katta " + num1 + " dan");
        } else {
            System.out.println(num1 + " va " + num2 + " teng!");
        }
    }
}
