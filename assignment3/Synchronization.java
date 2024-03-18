class Counter {
    private int c = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
    c++;
    }

    // Method to get the current count value
    public int getCount() {
        return c;
    }
}

class IncrementerThread extends Thread {
    private Counter counter;
    private int increments;

    public IncrementerThread(Counter counter, int increments) {
        this.counter = counter;
        this.increments = increments;
    }

    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int num = 5;
        int incrperthr = 500;

        IncrementerThread[] threads = new IncrementerThread[num];

        // Create and start multiple threads
        for (int i = 0; i < num; i++) {
            threads[i] = new IncrementerThread(counter, incrperthr);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (IncrementerThread thread : threads) {
            thread.join();
        }

        // Print the final count value
        System.out.println("Final count value: " + counter.getCount());
    }
}