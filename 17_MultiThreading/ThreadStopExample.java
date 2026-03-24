class ThreadStopExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Running: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadStopExample t1 = new ThreadStopExample();
        t1.start();
        try {
            Thread.sleep(3000);
            t1.stop(); // Stops the thread
            System.out.println("Thread Stopped");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
