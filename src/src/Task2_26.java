import java.util.Scanner;

public class Task2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1-son: ");
        int num1 = input.nextInt();

        System.out.print("2-son: ");
        int num2 = input.nextInt();

        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " soni " + num2 + " ga bolinadi");
            } else {
                System.out.println(num1 + " soni " + num2 + " ga bolinmaydi");
            }
        } else {
            System.out.println("Nolga bolish mumkin emas!");
        }
    }
}
