public class ArraySumUsingThreads implements Runnable {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;
    private static final int PARTIAL_ARRAY_SIZE = ARRAY_SIZE / THREAD_COUNT;

    private int[] numberArray = new int[ARRAY_SIZE];
    private int startIndex;
    private int partialSum;

    public void fillNumbers() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            numberArray[i] = i + 1;
        }
    }

    public int getPartialSum() {
        for (int i = startIndex; i < startIndex + PARTIAL_ARRAY_SIZE; i++) {
            partialSum += numberArray[i];
        }
        return partialSum;
    }

    @Override
    public void run() {
        partialSum = getPartialSum();
    }

    public static void main(String[] args) {
        ArraySumUsingThreads as = new ArraySumUsingThreads();
        as.fillNumbers();

        Thread[] threads = new Thread[THREAD_COUNT];
        int totalSum = 0;

        for (int i = 0; i < THREAD_COUNT; i++) {
            as.startIndex = i * PARTIAL_ARRAY_SIZE;
            threads[i] = new Thread(as);
            threads[i].start();
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            try {
                threads[i].join();
                totalSum += as.partialSum;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Final Sum: " + totalSum);
    }
}