package movieticketbookingsystem;

public class MovieFactory {
    public static Movie createMovie(String genre) {
        switch (genre.toLowerCase()) {
            case "action":
                return new ActionMovie();
            case "comedy":
                return new ComedyMovie();
            case "drama":
                return new DramaMovie();
            default:
                throw new IllegalArgumentException("Invalid movie genre");
        }
    }
}
