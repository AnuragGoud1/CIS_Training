public class TicketBooking implements Runnable {
    private static int ticketCounter = 1;
    private static int count = 0;

    @Override
    public void run() {
        long threadId = Thread.currentThread().getId();
        System.out.println("thread:"+threadId);

        if (threadId == 15 || threadId == 16 || threadId == 17) {
            synchronized (TicketBooking.class) {
                while (ticketCounter <= 20 && count<=5) {
                    int bookingId = ticketCounter++;
                    System.out.println("Thread " + threadId + " booked ticket " + bookingId);
                    count++;
                }
                count=0;
            }
        }
    }

    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();

        Thread t1 = new Thread(ticketBooking);
        Thread t2 = new Thread(ticketBooking);
        Thread t3 = new Thread(ticketBooking);

        t1.start();
        t2.start();
        t3.start();
    }
}
