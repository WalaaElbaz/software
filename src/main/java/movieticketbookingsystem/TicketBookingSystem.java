package movieticketbookingsystem;

public class TicketBookingSystem {
    private static TicketBookingSystem instance;

    // منع الإنشاء باستخدام constructor الخاص
    private TicketBookingSystem() {}

    // الحصول على النسخة الوحيدة من الكلاس
    public static TicketBookingSystem getInstance() {
        if (instance == null) {
            instance = new TicketBookingSystem();
        }
        return instance;
    }

    public void bookTicket(String movie, String theater, int quantity) {
        // منطق حجز التذاكر
        System.out.println("Booking " + quantity + " ticket(s) for " + movie + " at " + theater);
    }
}
