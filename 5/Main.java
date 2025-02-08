import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();

        System.out.print("Введите выходные дни (через пробел в формате dd.MM.yyyy): ");
        String weekendsInput = scanner.nextLine();
        String[] weekendDates = weekendsInput.split(" ");
        for (String date : weekendDates) {
            calendar.addWeekend(date);
        }

        System.out.print("Введите праздничные дни (через пробел в формате dd.MM.yyyy): ");
        String holidaysInput = scanner.nextLine();
        String[] holidayDates = holidaysInput.split(" ");
        for (String date : holidayDates) {
            calendar.addHoliday(date);
        }

        System.out.print("Выходные дни: ");
        for (String date : weekendDates) {
            System.out.print(date + " ");
        }
        System.out.println();

        System.out.print("Праздничные дни: ");
        for (String date : holidayDates) {
            System.out.print(date + " ");
        }
        System.out.println();
    }
}
