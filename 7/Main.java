import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        int writeIndex = 0;
        for (int num : numbers) {
            if (num % 2 != 0) { 
                numbers[writeIndex++] = num;
            }
        }

        while (writeIndex < numbers.length) {
            numbers[writeIndex++] = 0;
        }

        System.out.println("Результат: " + Arrays.toString(numbers));
    }
}
