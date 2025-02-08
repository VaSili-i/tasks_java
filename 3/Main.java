import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Airline> airlines = new ArrayList<>();

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public void printFlightsByDestination(String destination) {
        airlines.stream()
                .filter(airline -> airline.getDestination().equalsIgnoreCase(destination))
                .forEach(System.out::println);
    }

    public void printFlightsByDay(String day) {
        airlines.stream()
                .filter(airline -> airline.getDaysOfWeek().contains(day))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Main manager = new Main();
        manager.addAirline(new Airline("Нью-Йорк", "NY123", "Boeing 747", "10:00", List.of("Понедельник", "Среда", "Пятница")));
        manager.addAirline(new Airline("Лос-Анджелес", "LA456", "Airbus A320", "15:30", List.of("Вторник", "Четверг")));
        manager.addAirline(new Airline("Лондон", "LN789", "Boeing 777", "08:45", List.of("Понедельник", "Суббота")));

        System.out.println("Рейсы в Нью-Йорк:");
        manager.printFlightsByDestination("Нью-Йорк");

        System.out.println("Рейсы в понедельник:");
        manager.printFlightsByDay("Понедельник");
    }
}
