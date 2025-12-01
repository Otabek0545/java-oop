import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      a burchak gradusda berilgan (0<a<360). Berilgan burchakning qiymatini radianga o'tkazuvchi programma tuzing.

        System.out.print(" a ga (0<a<360) oraliqda qiymat kiriting: ");
        double a = scanner.nextDouble();
        double r = Math.toRadians(a);
        System.out.println("r = " + r);
    }
}
