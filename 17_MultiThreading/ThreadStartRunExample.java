class ThreadStartRunExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadStartRunExample t1 = new ThreadStartRunExample();
        t1.start(); // Calls run() method
    }
}
