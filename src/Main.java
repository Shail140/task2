
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("коэффициенты 1 прямой (a b c):");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();

        System.out.println("коэффициенты 2 прямой (a b c):");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double d = a1 * b2 - a2 * b1;

        if (d != 0) {
            double x = (b1 * c2 - b2 * c1) / d;
            double y = (c1 * a2 - c2 * a1) / d;

            System.out.println("пересекаются.");
            System.out.println("Точка пересечения: (" + x + "; " + y + ")");
        } else {
            if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {
                System.out.println("совпадают.");
            } else {
                System.out.println("параллельны.");
            }
        }

        scanner.close();
    }
}