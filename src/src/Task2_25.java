import java.util.Scanner;

public class Task2_25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " juft");
        } else {
            System.out.println(num + " toq");
        }
    }
}
