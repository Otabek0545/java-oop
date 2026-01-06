import java.util.Scanner;

public class Task2_34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double currentPopulation = scanner.nextDouble();

        System.out.print("Enter annual population growth rate (percent, e.g. 1.1 for 1.1%): ");
        double growthRatePercent = scanner.nextDouble();

        double growthRate = growthRatePercent / 100;

        System.out.println("\nEstimated world population:");

        double population = currentPopulation;
        for (int year = 1; year <= 5; year++) {
            population = population * (1 + growthRate);
            System.out.printf("After %d year(s): %.3f\n", year, population);
        }

    }
}
