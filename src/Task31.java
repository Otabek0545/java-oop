import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {

//        temp T(f) farangeytda berilgan,temp qiymatini T(c) gradus selsiyga o'tkazuvchi programma tuzilsin.
//        T(c) = (T(f) - 32) * 5/9

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Temperatura qiymatini T(f) kiriting: ");
        double tf = scanner.nextDouble();
        double tc = (tf - 32) * 5 / 9;
        System.out.printf("Selsiy boyicha gradus T(c): %.2fC", tc);
    }
}
