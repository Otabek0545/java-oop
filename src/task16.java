import java.util.Scanner;
public class task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        sonlar o'qida 2ta nuqta orasidagi masofa aniqlansin! |x1-x2|
        System.out.print("x1 = "); double x1 = scanner.nextDouble();
        System.out.print("x2 = "); double x2 = scanner.nextDouble();
        double m = Math.abs(x1-x2);
        System.out.print("|x1-x2| = "+m);
    }
}
