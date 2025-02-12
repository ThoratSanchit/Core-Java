class ThreadNamingExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        System.out.println("Thread Name: " + getName()); // Get thread name
    }

    public static void main(String[] args) {
        ThreadNamingExample t1 = new ThreadNamingExample();
        t1.setName("WorkerThread"); // Set thread name
        t1.start();
    }
}
