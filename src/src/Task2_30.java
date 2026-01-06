import java.util.Scanner;

public class Task2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Besh xonali son kiriitng: ");
        int number = input.nextInt();

        int digit1 = number / 10000;          // mingliklar
        int digit2 = (number / 1000) % 10;    // yuzliklar
        int digit3 = (number / 100) % 10;     // o‘nliklar
        int digit4 = (number / 10) % 10;      // birliklar
        int digit5 = number % 10;             // oxirgi raqam

        System.out.printf("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, digit4, digit5);
    }
}
