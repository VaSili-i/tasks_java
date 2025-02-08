import java.util.HashSet;
import java.util.Set;

public class Calendar {
    private Set<String> holidays; // Множество для хранения праздничных дней
    private Set<String> weekends; // Множество для хранения выходных дней

    public Calendar() {
        holidays = new HashSet<>();
        weekends = new HashSet<>();
    }

    // Метод для добавления праздников
    public void addHoliday(String date) {
        holidays.add(date);
    }

    // Метод для добавления выходных
    public void addWeekend(String date) {
        weekends.add(date);
    }

    // Метод для проверки, является ли день праздничным
    public boolean isHoliday(String date) {
        return holidays.contains(date);
    }

    // Метод для проверки, является ли день выходным
    public boolean isWeekend(String date) {
        return weekends.contains(date);
    }

    // Внутренний класс для работы с выходными и праздничными днями
    public class Day {
        private String date;

        public Day(String date) {
            this.date = date;
        }

        // Метод для проверки, является ли день праздничным
        public boolean isHoliday() {
            return Calendar.this.isHoliday(date);
        }

        // Метод для проверки, является ли день выходным
        public boolean isWeekend() {
            return Calendar.this.isWeekend(date);
        }

        // Получить дату дня
        public String getDate() {
            return date;
        }
    }
}
