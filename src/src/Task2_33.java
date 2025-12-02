import java.util.Scanner;

public class Task2_33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weightKg = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        double heightM = scanner.nextDouble();

        double bmi = weightKg / (heightM * heightM);

        System.out.printf("Your BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("\nYou are UNDERWEIGHT.");
        } else if (bmi < 25) {
            System.out.println("\nYou have a NORMAL weight.");
        } else if (bmi < 30) {
            System.out.println("\nYou are OVERWEIGHT.");
        } else {
            System.out.println("\nYou are OBESE.");
        }

    }
}
