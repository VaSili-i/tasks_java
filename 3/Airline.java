import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String destination;
    private String flightNumber;
    private String aircraftType;
    private String departureTime;
    private List<String> daysOfWeek;

    public Airline(String destination, String flightNumber, String aircraftType, String departureTime, List<String> daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = new ArrayList<>(daysOfWeek);
    }

    public Airline(String destination, String flightNumber) {
        this(destination, flightNumber, "Неизвестный", "00:00", new ArrayList<>());
    }

    @Override
    public String toString() {
        return String.format("Рейс %s в %s по дням %s в %s (%s)", flightNumber, destination, daysOfWeek, departureTime, aircraftType);
    }


    public String getDestination() {
        return destination;
    }

    public List<String> getDaysOfWeek() {
        return daysOfWeek;
    }
}
