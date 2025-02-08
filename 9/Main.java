import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        String fileName = "input.txt";
        try {
            List<Double> numbers = readFile(fileName);
            double sum = calculateSum(numbers);
            double average = calculateAverage(numbers);
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Среднее значение: " + average);
        } catch (FileNotFoundException e) {
            handleError("Файл не найден", e);
        } catch (IOException e) {
            handleError("Ошибка чтения файла", e);
        } catch (InvalidNumberException e) {
            handleError("Ошибка в данных", e);
        } catch (OutOfMemoryError e) {
            handleError("Ошибка нехватки памяти", e);
        } catch (Exception e) {
            handleError("Произошла непредвиденная ошибка", e);
        }
    }

    private static void handleError(String message, Throwable e) {
        System.err.println(message + ": " + e.getMessage());
    }

    public static List<Double> readFile(String fileName) throws IOException, InvalidNumberException {
        List<Double> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                line = line.trim();
                // Разделяем строку 
                String[] parts = line.split("\\s+");
                for (String part : parts) {
                    if (!isValidNumber(part)) {
                        throw new InvalidNumberException("Некорректное число на строке " + lineNumber, part, lineNumber);
                    }
                    numbers.add(Double.parseDouble(part));
                }
            }
        }
        return numbers;
    }

    public static boolean isValidNumber(String str) {
        String regex = "^[+-]?([0-9]*[.])?[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static double calculateSum(List<Double> numbers) {
        return numbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    public static double calculateAverage(List<Double> numbers) {
        return numbers.isEmpty() ? 0 : calculateSum(numbers) / numbers.size();
    }
}
