class ThreadAliveCheckExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadAliveCheckExample t1 = new ThreadAliveCheckExample();
        System.out.println("Before start: " + t1.isAlive()); // false
        t1.start();
        System.out.println("After start: " + t1.isAlive()); // true (during execution)
    }
}
