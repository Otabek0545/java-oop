import java.util.Scanner;

public class Task2_35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Total miles driven per day: ");
        double milesPerDay = scanner.nextDouble();

        System.out.print("Cost per gallon of gasoline (in your currency): ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Average miles per gallon (mpg): ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Parking fees per day: ");
        double parkingPerDay = scanner.nextDouble();

        System.out.print("Tolls per day: ");
        double tollsPerDay = scanner.nextDouble();

        double gallonsUsedPerDay = milesPerDay / milesPerGallon;
        double fuelCostPerDay = gallonsUsedPerDay * costPerGallon;
        double totalCostPerDay = fuelCostPerDay + parkingPerDay + tollsPerDay;

        System.out.printf("Fuel cost: %.2f\n", fuelCostPerDay);
        System.out.printf("Parking fees: %.2f\n", parkingPerDay);
        System.out.printf("Tolls: %.2f\n", tollsPerDay);
        System.out.printf("Total cost per day: %.2f\n", totalCostPerDay);

    }
}
