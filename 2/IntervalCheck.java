import java.util.Scanner;

public class IntervalCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double defaultN = 2;
        double defaultM = 5;
        double defaultK = 4;

        System.out.println("Введите значение для n (по умолчанию " + defaultN + "):");
        double n = getInputValue(scanner, defaultN);

        System.out.println("Введите значение для m (по умолчанию " + defaultM + "):");
        double m = getInputValue(scanner, defaultM);

        System.out.println("Введите значение для k (по умолчанию " + defaultK + "):");
        double k = getInputValue(scanner, defaultK);

        System.out.println("\nПринадлежность k = " + k + " интервалам:");

        System.out.println("(n, m): " + isInOpenInterval(n, m, k));

        System.out.println("[n, m): " + isInLeftClosedRightOpenInterval(n, m, k));

        System.out.println("(n, m]: " + isInLeftOpenRightClosedInterval(n, m, k));

        System.out.println("[n, m]: " + isInClosedInterval(n, m, k));
    }

    public static double getInputValue(Scanner scanner, double defaultValue) {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            return defaultValue;
        } else {
            return Double.parseDouble(input);
        }
    }

    public static boolean isInOpenInterval(double n, double m, double k) {
        return k > n && k < m;
    }

    public static boolean isInLeftClosedRightOpenInterval(double n, double m, double k) {
        return k >= n && k < m;
    }

    public static boolean isInLeftOpenRightClosedInterval(double n, double m, double k) {
        return k > n && k <= m;
    }

    public static boolean isInClosedInterval(double n, double m, double k) {
        return k >= n && k <= m;
    }

}

