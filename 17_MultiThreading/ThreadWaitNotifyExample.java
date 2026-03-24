class ThreadWaitNotifyExample {
    private static final Object LOCK = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK) {
                System.out.println("Thread waiting...");
                try {
                    LOCK.wait(); // Thread goes into waiting state
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread resumed!");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (LOCK) {
                System.out.println("Notifying thread...");
                LOCK.notify(); // Resumes the waiting thread
            }
        });

        t1.start();
        try {
            Thread.sleep(2000); // Ensures t1 starts first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
