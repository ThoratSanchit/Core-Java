// Synchronization prevents race conditions when multiple threads access shared data

class BankAccount {
    private int balance = 1000;

    // synchronized method — only one thread can execute this at a time
    public synchronized void withdraw(int amount) {
        String thread = Thread.currentThread().getName();
        System.out.println(thread + " trying to withdraw: " + amount);

        if (balance >= amount) {
            System.out.println(thread + " proceeding...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println(thread + " withdrew " + amount + " | Balance: " + balance);
        } else {
            System.out.println(thread + " FAILED — insufficient balance: " + balance);
        }
    }

    public int getBalance() { return balance; }
}

// Synchronized block — finer control, lock only the critical section
class Counter {
    private int count = 0;

    public void increment() {
        synchronized (this) {  // lock on 'this' object
            count++;
        }
    }

    public int getCount() { return count; }
}

// Deadlock example — two threads waiting on each other's lock
class DeadlockDemo {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    static void showDeadlock() {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("T1 holds lock1, waiting for lock2...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lock2) {
                    System.out.println("T1 acquired lock2");
                }
            }
        }, "T1");

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("T2 holds lock2, waiting for lock1...");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (lock1) {
                    System.out.println("T2 acquired lock1");
                }
            }
        }, "T2");

        // t1.start(); t2.start();  // ← uncomment to see deadlock (program hangs)
        System.out.println("Deadlock demo skipped (would hang). Always acquire locks in same order to avoid deadlock.");
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {

        // --- Synchronized method demo ---
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Thread-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.getBalance());

        // --- Synchronized block demo ---
        Counter counter = new Counter();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(counter::increment);
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        System.out.println("Counter (should be 100): " + counter.getCount());

        // --- Deadlock info ---
        DeadlockDemo.showDeadlock();
    }
}
