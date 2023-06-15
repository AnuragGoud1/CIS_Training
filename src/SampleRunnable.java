public class SampleRunnable implements Runnable {

    public void printNextTenNumbers(){
        for (int i = 11; i <= 20; i++) {
            System.out.println("Number:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number:" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SampleRunnable sr = new SampleRunnable();
        SampleRunnable sr2= new SampleRunnable();
        Thread thread1 = new Thread(sr::run);
        Thread thread2 = new Thread(sr2::printNextTenNumbers);
        thread1.start();
        thread2.start();
    }
}
