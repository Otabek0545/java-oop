import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ikkita son a va b berilgan ularni o'rta arifmetifi (a+b)/2 aniqlansin!
        System.out.print("a = "); double a = scanner.nextDouble();
        System.out.print("b = "); double b = scanner.nextDouble();
        System.out.print("O'rta arifmetigi: "+ (a+b)/2);
    }
}
