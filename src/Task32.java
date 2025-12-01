import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {

//        temp T(c) gradus selsiyda berilgan,temp qiymatini T(f) farangeytga o'tkazuvchi programma tuzilsin.
//        T(f) = (T(c) - 32) * 5/9

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Gradus qiymat T(c) kiriting: ");
        double tc = scanner.nextDouble();
        double tf = (tc - 32) * 5 / 9;
        System.out.printf("Farangeyt T(f) qiymati: %.2f", tf);

    }
}
