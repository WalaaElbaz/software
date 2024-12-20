package movieticketbookingsystem;

public class SessionManager {
    private static SessionManager instance;

    // حالة الجلسة
    private boolean isBooking;

    private SessionManager() {
        this.isBooking = false;
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public boolean isBooking() {
        return isBooking;
    }

    public void startBooking() {
        isBooking = true;
        System.out.println("Booking started.");
    }

    public void endBooking() {
        isBooking = false;
        System.out.println("Booking ended.");
    }
}
