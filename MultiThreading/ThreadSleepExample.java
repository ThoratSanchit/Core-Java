class ThreadSleepExample extends Thread {
    public void run() {
        try {
            System.out.println("Thread sleeping...");
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("Thread woke up!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        ThreadSleepExample t1 = new ThreadSleepExample();
        t1.start();
    }
}
