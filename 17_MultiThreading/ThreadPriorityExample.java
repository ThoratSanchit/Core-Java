class ThreadPriorityExample extends Thread {
    public void run() {
        System.out.println("Thread Running with Priority: " + getPriority());
    }

    public static void main(String[] args) {
        ThreadPriorityExample t1 = new ThreadPriorityExample();
        t1.setPriority(Thread.MAX_PRIORITY); // Set highest priority (10)
        t1.start();
    }
}
