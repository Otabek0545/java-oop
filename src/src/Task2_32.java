import java.util.Scanner;

public class Task2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int musbatSon = 0;
        int manfiySon = 0;
        int nolSoni = 0;

        System.out.println("Iltimos, 5 ta son kiriting! ");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "-son: ");
            int number = input.nextInt();

            if (number > 0) {
                musbatSon++;
            } else if (number < 0) {
                manfiySon++;
            } else {
                nolSoni++;
            }
        }

        System.out.println("Musbat sonlar soni: " + musbatSon);
        System.out.println("Manfiy sonlar soni: " + manfiySon);
        System.out.println("Nollar soni: " + nolSoni);

    }
}
