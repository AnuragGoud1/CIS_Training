public class SampleThread extends Thread{

    public void printNumbers() throws InterruptedException {
        for( int i=1;i<=10;i++){
            System.out.println("Number:"+i);
            Thread.sleep(2000);
        }
    }
    public void run(){
        try {
            printNumbers();
        } catch( InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SampleThread thread = new SampleThread();
        thread.start();
    }
}
