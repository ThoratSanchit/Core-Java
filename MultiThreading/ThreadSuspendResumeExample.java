class ThreadSuspendResumeExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Running: " + i);
            try {
                Thread.sleep(1000); // 1 sec delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSuspendResumeExample t1 = new ThreadSuspendResumeExample();
        t1.start();
        try {
            Thread.sleep(3000); // Pause main thread for 3 sec
            t1.suspend(); // Suspend thread
            System.out.println("Thread Suspended");
            Thread.sleep(2000); // 2 sec delay
            t1.resume(); // Resume thread
            System.out.println("Thread Resumed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
