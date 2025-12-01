import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {

//        aylananing diametri d berilgan uning uzunligini toping. L=pi*d, pi=3.14

        Scanner scanner = new Scanner(System.in);
        System.out.print("d = ");
        double d = scanner.nextDouble();
        double pi = 3.14;
        System.out.print("L = "+pi*d);   /* masala shartida pi=3.14 deb olinsin deyilgani uchun Math.PI ishlatilmadi!*/
    }
}
