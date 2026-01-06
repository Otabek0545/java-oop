package cases;

import java.util.Scanner;

public class Case11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        char c = scanner.next().charAt(0);

        c = turn(c, k1);
        c = turn(c, k2);

        System.out.println(c);

    }

    static char turn(char c, int k) {
        switch (k) {
            case 0:
                switch (c) {
                    case 's':
                        return 'q';
                    case 'q':
                        return 'j';
                    case 'j':
                        return 'g';
                    case 'g':
                        return 's';
                    default:
                        System.out.println("Noto‘g‘ri yo‘nalish!");
                        return c;
                }
            case 1:
                switch (c) {
                    case 's':
                        return 'g';
                    case 'g':
                        return 'j';
                    case 'j':
                        return 'q';
                    case 'q':
                        return 's';
                    default:
                        System.out.println("Noto‘g‘ri yo‘nalish!");
                        return c;
                }
            case 2:
                switch (c) {
                    case 's':
                        return 'j';
                    case 'j':
                        return 's';
                    case 'q':
                        return 'g';
                    case 'g':
                        return 'q';
                    default:
                        System.out.println("Noto‘g‘ri yo‘nalish!");
                        return c;
                }
            default:
                System.out.println("notogri komanda!");
                return c;
        }
    }
}
