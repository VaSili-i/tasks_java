import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JustNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        List<Integer> primes = new ArrayList<>();

        System.out.println("Введите " + n + " целых чисел:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        scanner.close();

        System.out.println("Простые числа:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
