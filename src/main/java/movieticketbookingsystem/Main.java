package movieticketbookingsystem;

public class Main {
    public static void main(String[] args) {
        // استخدام الـ Singleton
        TicketBookingSystem ticketBookingSystem = TicketBookingSystem.getInstance();
        SessionManager sessionManager = SessionManager.getInstance();

        // البدء في حجز التذاكر
        sessionManager.startBooking();
        ticketBookingSystem.bookTicket("Avengers", "Cinema", 3);
        sessionManager.endBooking();

        // استخدام الـ Factory لإنشاء نوع فيلم وموقع سينما
        Movie movie = MovieFactory.createMovie("action");
        Theater theater = TheaterFactory.createTheater("imax");

        movie.displayInfo();
        theater.displayLocation();
    }
}
