import java.util.Scanner;

public class Task2_24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int c = scanner.nextInt();

        System.out.print("Enter fourth integer: ");
        int d = scanner.nextInt();

        System.out.print("Enter fifth integer: ");
        int e = scanner.nextInt();

        int largest = a;
        int smallest = a;

        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;
        if (e > largest) largest = e;

        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (d < smallest) smallest = d;
        if (e < smallest) smallest = e;

        System.out.println("\nLargest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
