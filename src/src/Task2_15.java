import java.util.Scanner;

public class Task2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-son: ");
        int num1 = scanner.nextInt();

        System.out.print("2-son: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int mult = num1 * num2;
        int difference = num1 - num2;
        int divide = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + mult);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + divide);
    }
}
