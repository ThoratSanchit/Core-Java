Here's a **list of all `Thread` class methods** with their uses for your notes:  

---

## **📝 Thread Class Methods & Their Uses**

### **1️⃣ setName(String name)**  
🔹 **Use:** Sets the name of the thread.  
🔹 **Example:** `t1.setName("WorkerThread");`

---

### **2️⃣ getName() → String**  
🔹 **Use:** Returns the name of the thread.  
🔹 **Example:** `System.out.println(t1.getName());`

---

### **3️⃣ setPriority(int priority)**  
🔹 **Use:** Sets the priority of the thread (`1` to `10`).  
🔹 **Example:** `t1.setPriority(Thread.MAX_PRIORITY);`  

| Priority Level  | Constant          | Value |
|-----------------|------------------|-------|
| Minimum        | `Thread.MIN_PRIORITY`  | 1     |
| Normal         | `Thread.NORM_PRIORITY` | 5     |
| Maximum        | `Thread.MAX_PRIORITY`  | 10    |

---

### **4️⃣ getPriority() → int**  
🔹 **Use:** Returns the priority of the thread.  
🔹 **Example:** `System.out.println(t1.getPriority());`

---

### **5️⃣ isAlive() → boolean**  
🔹 **Use:** Checks if the thread is still running.  
🔹 **Example:** `System.out.println(t1.isAlive());`

---

### **6️⃣ run()**  
🔹 **Use:** Contains the logic of the thread.  
🔹 **Example:**  
```java
public void run() { 
    System.out.println("Thread is running...");
}
```
✅ **Called by `start()`** (Do **not** call `run()` directly).

---

### **7️⃣ start()**  
🔹 **Use:** Starts the thread and calls the `run()` method.  
🔹 **Example:** `t1.start();`

---

### **8️⃣ sleep(long millis) (throws InterruptedException)**  
🔹 **Use:** Puts the thread to sleep (pause execution).  
🔹 **Example:**  
```java
Thread.sleep(2000); // Sleeps for 2 sec
```

---

### **1️⃣2️⃣ join() (throws InterruptedException)**  
🔹 **Use:** Makes the main thread wait until another thread completes.  
🔹 **Example:**  
```java
t1.join(); // Waits for t1 to finish
```

---

### **1️⃣3️⃣ yield()**  
🔹 **Use:** Temporarily pauses the current thread to allow others to execute.  
🔹 **Example:** `Thread.yield();`

---

### **1️⃣4️⃣ isInterrupted() → boolean**  
🔹 **Use:** Checks if the thread has been interrupted.  
🔹 **Example:**  
```java
if (t1.isInterrupted()) {
    System.out.println("Thread was interrupted");
}
```

---

### **1️⃣5️⃣ interrupt()**  
🔹 **Use:** Interrupts the thread if it is sleeping or waiting.  
🔹 **Example:** `t1.interrupt();`

---

## **Summary Table**
| **Method** | **Use** |
|------------|---------|
| `setName(String name)` | Sets the thread name |
| `getName()` | Gets the thread name |
| `setPriority(int priority)` | Sets thread priority (1-10) |
| `getPriority()` | Gets thread priority |
| `isAlive()` | Checks if thread is still running |
| `run()` | Defines the thread task |
| `start()` | Starts the thread |
| `sleep(long millis)` | Puts thread to sleep |
| `suspend()` *(Deprecated)* | Suspends a thread |
| `resume()` *(Deprecated)* | Resumes a thread |
| `stop()` *(Deprecated)* | Stops a thread |
| `join()` | Makes one thread wait for another to finish |
| `yield()` | Allows other threads to execute |
| `isInterrupted()` | Checks if thread is interrupted |
| `interrupt()` | Interrupts a thread |

---

This list is **perfect for your notes**! Let me know if you need more details. 🚀