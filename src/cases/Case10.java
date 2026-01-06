package cases;

import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        char y = scanner.next().charAt(0);

        switch (k) {
            case 0:
                break;
            case 1:
                switch (y) {
                    case 's':
                        y = 'g';
                        break;
                    case 'q':
                        y = 's';
                        break;
                    case 'j':
                        y = 'q';
                        break;
                    case 'g':
                        y = 'j';
                        break;
                }
                break;
            case 2:
                switch (y) {
                    case 's':
                        y = 'q';
                        break;
                    case 'q':
                        y = 'j';
                        break;
                    case 'j':
                        y = 'g';
                        break;
                    case 'g':
                        y = 's';
                        break;
                }
                break;
            default:
                System.out.println("Notogri komanda!");
                return;
        }
        System.out.println(y);
    }
}
