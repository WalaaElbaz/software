package movieticketbookingsystem;

public class TheaterFactory {
    public static Theater createTheater(String location) {
        switch (location.toLowerCase()) {
            case "cinema":
                return new CinemaHall();
            case "imax":
                return new IMAX();
            default:
                throw new IllegalArgumentException("Invalid theater location");
        }
    }
}
