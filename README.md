# Core Java - Complete Theory & Practice Guide

## 📚 Table of Contents
1. [Introduction to Java](#1-introduction-to-java)
2. [Primitive Data Types](#2-primitive-data-types)
3. [Conditional Statements](#3-conditional-statements)
4. [Loops](#4-loops)
5. [Functions/Methods](#5-functionsmethods)
6. [Arrays](#6-arrays)
7. [Command Line Arguments](#7-command-line-arguments)
8. [Object-Oriented Programming (OOPs)](#8-object-oriented-programming-oops)
9. [Exception Handling](#9-exception-handling)
10. [Collection Framework](#10-collection-framework)
11. [Multi-Threading](#11-multi-threading)
12. [Java Streams API](#12-java-streams-api)
13. [Interview Questions & Answers](#13-interview-questions--answers)

---

## 1. Introduction to Java

### What is Java?
Java is a high-level, object-oriented programming language designed to have minimal implementation dependencies. It follows the "Write Once, Run Anywhere" (WORA) principle, meaning compiled Java code can run on any platform that supports Java without recompilation.

### Key Features:
- **Platform Independent**: Java code is compiled to bytecode which runs on the JVM (Java Virtual Machine)
- **Object-Oriented**: Everything in Java is an object (except primitive types)
- **Robust and Secure**: Strong memory management, exception handling, and security features
- **Multi-threaded**: Built-in support for multi-threaded programming
- **Rich API**: Extensive standard library for various functionalities

### Hello World Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

---

## 2. Primitive Data Types

### Definition
Primitive data types are the basic data types built into Java. They are not objects and store their values directly in memory.

### 8 Primitive Data Types:

| Data Type | Size | Range | Default Value |
|-----------|------|-------|---------------|
| `byte` | 1 byte | -128 to 127 | 0 |
| `short` | 2 bytes | -32,768 to 32,767 | 0 |
| `int` | 4 bytes | -2³¹ to 2³¹-1 | 0 |
| `long` | 8 bytes | -2⁶³ to 2⁶³-1 | 0L |
| `float` | 4 bytes | Single-precision | 0.0f |
| `double` | 8 bytes | Double-precision | 0.0d |
| `char` | 2 bytes | 0 to 65,535 (Unicode) | '\u0000' |
| `boolean` | 1 byte | true or false | false |

### Example:
```java
byte aByte = 127;
short aShort = 32000;
int anInt = 2147483647;
long aLong = 9223372036854775807L;
float aFloat = 3.14f;
double aDouble = 3.141592653589793;
char aChar = 'A';
boolean aBoolean = true;
```

---

## 3. Conditional Statements

### Definition
Conditional statements allow the program to make decisions and execute different code based on conditions.

### Types of Conditional Statements:

#### 1. **if-else Statement**
```java
if (age >= 18) {
    System.out.println("You are eligible to vote.");
} else {
    System.out.println("You are not eligible to vote.");
}
```

#### 2. **else-if Ladder**
```java
if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 75) {
    System.out.println("Grade: B");
} else if (marks >= 50) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

#### 3. **switch Statement**
```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

#### 4. **Ternary Operator**
```java
String result = (number > 0) ? "Positive" : "Not Positive";
```

---

## 4. Loops

### Definition
A loop in Java is used to repeat a block of code multiple times. It is useful when you want to perform a task repeatedly without writing the same code multiple times.

### Types of Loops:

#### 1. **for Loop**
Used when the number of iterations is known in advance.
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

#### 2. **while Loop**
Used when the number of iterations is not known in advance, but a condition needs to be checked before each iteration.
```java
int j = 1;
while (j <= 5) {
    System.out.println(j);
    j++;
}
```

#### 3. **do-while Loop**
Similar to while loop, but guarantees at least one iteration because the condition is checked after the loop runs.
```java
int k = 1;
do {
    System.out.println(k);
    k++;
} while (k <= 5);
```

### Why Use Loops?
- **Avoid redundancy**: Repeat actions without duplicating code
- **Process collections**: Iterate through arrays, lists, or other collections
- **Automate tasks**: Calculate sums, find maximum elements, etc.

---

## 5. Functions/Methods

### Definition
A function (or method in Java) is a block of code that performs a specific task. It allows code to be reused and organized into logical units. Functions can take input parameters and return a value.

### Types of Functions:

#### 1. **Void Function**
A function that doesn't return any value.
```java
public static void greet() {
    System.out.println("Hello, welcome to Java functions!");
}
```

#### 2. **Return Function**
A function that returns a value after processing.
```java
public static int add(int a, int b) {
    return a + b;
}
```

#### 3. **Function with Parameters**
```java
public static double multiply(double x, double y) {
    return x * y;
}
```

### Benefits:
- **Code Reusability**: Write once, use multiple times
- **Modularity**: Break complex problems into smaller parts
- **Maintainability**: Easier to debug and update code

---

## 6. Arrays

### Definition
An array is a collection of elements of the same type stored in contiguous memory locations. In Java, arrays are objects that allow you to store a fixed-size sequence of elements. Each element can be accessed using its index, starting from 0.

### Declaration and Initialization:
```java
// Declaration
int[] numbers = {10, 20, 30, 40, 50};

// Access elements
System.out.println("First element: " + numbers[0]);
System.out.println("Third element: " + numbers[2]);

// Modify elements
numbers[1] = 25;

// Iterate through array
for (int num : numbers) {
    System.out.println(num);
}
```

### Features:
- **Fixed Size**: Size cannot be changed after creation
- **Index-based Access**: Elements accessed using index (0 to length-1)
- **Same Type**: All elements must be of the same data type
- **Contiguous Memory**: Elements stored sequentially in memory

---

## 7. Command Line Arguments

### Definition
Command line arguments are parameters passed to the program when it is executed from the command line. They are stored in the `String[] args` parameter of the main method.

### Example:
```java
public class CommandLineArguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
```

### Usage:
```bash
java CommandLineArguments arg1 arg2 arg3
```

---

## 8. Object-Oriented Programming (OOPs)

### Definition
OOPs is a programming paradigm based on the concept of objects that contain data (fields) and methods (functions). Java is an object-oriented programming language that uses OOP principles.

### Core OOPs Concepts:

### 8.1 **Class**
- A blueprint for creating objects
- Defines properties (fields) and behaviors (methods)

```java
public class Car {
    String brand;
    int year;
    
    void start() {
        System.out.println("Car is starting...");
    }
}
```

### 8.2 **Object**
- An instance of a class
- Created using the `new` keyword

```java
Car myCar = new Car();
myCar.brand = "Toyota";
myCar.start();
```

### 8.3 **Encapsulation**
Restricts direct access to fields and provides controlled access using methods (getters and setters).

**Benefits:**
- Data hiding and security
- Flexibility in changing implementation
- Better control over data

```java
public class Person {
    private String name;  // private field
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
```

### 8.4 **Inheritance**
Allows one class to acquire the properties and methods of another class.

**Benefits:**
- Code reusability
- Method overriding
- Hierarchical classification

```java
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}
```

**Types of Inheritance:**
- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance
- (Multiple inheritance through interfaces only)

### 8.5 **Polymorphism**
Allows objects to take many forms. Achieved through method overloading and method overriding.

#### **Method Overloading** (Compile-time Polymorphism)
Same method name but different parameters.
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

#### **Method Overriding** (Runtime Polymorphism)
Child class provides specific implementation of parent class method.
```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### 8.6 **Abstraction**
Hides implementation details and shows only functionality. Achieved using abstract classes and interfaces.

#### **Abstract Class**
- Contains at least one abstract method (combination of abstract and concrete methods)
- Cannot be used to create objects
- Uses `abstract` keyword

```java
abstract class Animal {
    public abstract void animalSound();  // Abstract method
    
    public void sleep() {  // Concrete method
        System.out.println("Zzz");
    }
}
```

#### **Concrete Class**
Contains instance methods and data members. All normal classes are examples of concrete classes.

### 8.7 **Interface**
A completely "abstract class" that is used to group related methods with empty bodies.

**Key Points:**
- User-defined data type
- Group of abstract methods
- Can extend multiple interfaces (unlike classes)
- Use `implements` keyword to use interface
- Methods are by default `public` and `abstract`
- Attributes are by default `public`, `static`, and `final`
- Cannot contain constructors

```java
interface Home {
    void cook();      // abstract method
    void bathRoom();  // abstract method
}

class MyHome implements Home {
    public void cook() {
        System.out.println("Cooking food");
    }
    
    public void bathRoom() {
        System.out.println("Using bathroom");
    }
}
```

### Important OOPs Keywords:

| Keyword | Description |
|---------|-------------|
| `this` | Refers to the current object instance |
| `super` | Refers to the parent class's methods or constructor |
| `final` | Used to declare constants, prevent inheritance, or overriding |
| `static` | Used for class-level methods or variables |
| `abstract` | Declares a class or method as abstract |

---

## 9. Exception Handling

### Definition
Exception handling in Java is a mechanism to handle runtime errors, ensuring the normal flow of the program. It uses a combination of `try`, `catch`, `finally`, `throw`, and `throws` keywords.

### Why Use Exception Handling?
- **Prevent Crashes**: Ensures the program doesn't terminate unexpectedly
- **Error Diagnosis**: Helps identify the cause of the error
- **Graceful Recovery**: Allows the program to recover or provide meaningful feedback

### What is an Exception?
An exception is an event that disrupts the normal flow of a program. Examples include:
- Dividing by zero
- Accessing an invalid array index
- Opening a file that doesn't exist

### Key Components:

#### 1. **try-catch Block**
```java
try {
    int result = 10 / 0;  // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
}
```

#### 2. **finally Block**
Always executes, whether exception occurs or not.
```java
try {
    // code that may throw exception
} catch (Exception e) {
    // handle exception
} finally {
    // cleanup code (always executes)
}
```

#### 3. **throw Keyword**
Used to explicitly throw an exception.
```java
throw new ArithmeticException("Custom error message");
```

#### 4. **throws Keyword**
Used in method signature to declare exceptions.
```java
public void readFile() throws IOException {
    // code that may throw IOException
}
```

### Custom Exceptions
You can create your own exceptions by extending the `Exception` class.

```java
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
```

---

## 10. Collection Framework

### Definition
The Java Collection Framework provides a set of interfaces and classes to store and manipulate groups of objects. It provides a unified architecture for representing and manipulating collections.

### Collection Framework Hierarchy:

```
Collection Interface (Stores groups of elements)
├── List Interface (Allows duplicates, maintains insertion order)
│   ├── ArrayList (✅ Fast random access, ❌ Slow insert/delete in middle)
│   ├── LinkedList (✅ Fast insert/delete, ❌ Slow random access)
│   └── Vector (legacy) (✅ Thread-safe, ❌ Slower than ArrayList)
│       └── Stack (legacy) (✅ LIFO, ❌ Use ArrayDeque instead)
├── Set Interface (Unique elements, no duplicates)
│   ├── HashSet (✅ Fastest lookup, ❌ No order guarantee)
│   ├── LinkedHashSet (✅ Maintains insertion order, ❌ Slightly slower)
│   └── SortedSet Interface (Sorted elements)
│       └── TreeSet (✅ Keeps elements sorted, ❌ Slower than HashSet)
└── Queue Interface (FIFO operations)
    ├── PriorityQueue (✅ Priority-based, ❌ No FIFO guarantee)
    └── Deque Interface (Double-ended queue)
        ├── ArrayDeque (✅ Best for stack/queue, ❌ No indexing)
        └── LinkedList (✅ Fast inserts/deletes, ❌ More memory)

Map Interface (Stores Key-Value pairs)
├── HashMap (✅ Fastest lookup, ❌ No order, ❌ Not thread-safe)
├── LinkedHashMap (✅ Maintains insertion order, ❌ Slower than HashMap)
├── TreeMap (✅ Sorted by key, ❌ Slower than HashMap)
└── Hashtable (legacy) (✅ Thread-safe, ❌ Slower, ❌ No null keys/values)
```

---

### 10.1 List Interface

#### Definition
The List interface represents an ordered collection where:
- **Duplicates are allowed**
- **Insertion order is preserved**
- **Elements can be accessed by index**

#### Key Features:
1. **Ordered Collection**: Elements stored in specific sequence
2. **Index-Based Operations**: Access elements by position
3. **Allows Duplicates**: Same element can be added multiple times
4. **Null Elements**: Most implementations allow null elements

---

#### 10.1.1 ArrayList

**Definition**: A resizable array implementation of the List interface.

**Key Features:**
- Dynamic sizing (automatically resizes)
- Fast random access using index - O(1)
- Type-safe with generics

**Common Methods:**
```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);                    // Add element
list.add(1, 20);                 // Insert at index
list.remove(0);                  // Remove by index
list.set(0, 30);                 // Replace element
list.get(0);                     // Get element at index
list.size();                     // Get size
list.contains(10);               // Check if contains element
list.clear();                    // Remove all elements
```

**When to Use:**
- Dynamic collections with unknown size
- Frequent random access by index
- When maintaining insertion order is important

**Limitations:**
- Not synchronized (not thread-safe)
- Insertion/deletion in middle is slow - O(n)

**Time Complexity:**
- Access by index: O(1)
- Insertion/Deletion at end: O(1)
- Insertion/Deletion in middle: O(n)

---

#### 10.1.2 LinkedList

**Definition**: A doubly-linked list implementation where each node contains data and references to next and previous nodes.

**Structure:**
- **Singly Linked List**: Each node points to next node
- **Doubly Linked List**: Each node has pointers to both next and previous nodes
- **Circular Linked List**: Last node points to first node

**Key Features:**
- Implements both List and Deque interfaces
- Dynamic memory allocation
- Efficient insertions/deletions at both ends
- Not efficient for random access

**Common Methods:**
```java
LinkedList<String> list = new LinkedList<>();

// Basic Operations
list.add("A");                   // Add to end
list.add(1, "B");               // Insert at index
list.remove(0);                 // Remove by index
list.get(0);                    // Get element at index
list.set(0, "C");               // Replace element

// Queue Operations
list.offer("D");                // Add to end (queue)
list.poll();                    // Remove first element
list.peek();                    // Get first element

// Deque Operations
list.addFirst("E");             // Add at beginning
list.addLast("F");              // Add at end
list.removeFirst();             // Remove first
list.removeLast();              // Remove last
list.getFirst();                // Get first element
list.getLast();                 // Get last element
```

**When to Use:**
- Frequent insertions/deletions, especially at start or middle
- Implementing queues or stacks
- Sequential access rather than random access

**Advantages:**
- Dynamic memory usage (no need to specify size)
- Efficient insertions/deletions - O(1) at ends
- No memory wastage

**Disadvantages:**
- Slow random access - O(n)
- Higher memory overhead (stores pointers)

---

#### 10.1.3 Vector

**Description:**
- Legacy class (since Java 1.0)
- Similar to ArrayList but **thread-safe** (synchronized)
- Slower than ArrayList due to synchronization

**When to Use:**
- When you need a thread-safe list
- Note: `Collections.synchronizedList()` is preferred in modern Java

---

#### 10.1.4 Stack

**Definition**: A Last-In-First-Out (LIFO) data structure extending Vector class.

**Key Features:**
- LIFO Principle: Last element added is first one removed
- Dynamic Size: Resizes automatically
- Thread-Safe: Methods are synchronized
- Extends Vector

**Common Methods:**
```java
Stack<Integer> stack = new Stack<>();

stack.push(10);                 // Add to top
stack.pop();                    // Remove and return top
stack.peek();                   // Return top without removing
stack.isEmpty();                // Check if empty
stack.search(10);               // Get position from top (1-based)
stack.size();                   // Get number of elements
```

**When to Use:**
- LIFO operations
- Expression evaluation
- Undo mechanisms
- Note: `ArrayDeque` is recommended over Stack for better performance

**Iterating Through a List:**
```java
// 1. for loop
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

// 2. Enhanced for-loop
for (String item : list) {
    System.out.println(item);
}

// 3. Iterator
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

// 4. forEach (Java 8+)
list.forEach(item -> System.out.println(item));
```

---

### 10.2 Set Interface

#### Definition
The Set interface represents an unordered collection (except SortedSet) that:
- **Does NOT allow duplicate elements**
- **Allows at most one null element** (depends on implementation)
- **Does not maintain insertion order** (except LinkedHashSet)

#### Common Methods:
```java
Set<String> set = new HashSet<>();

// Basic Operations
set.add("A");                   // Add element
set.remove("A");                // Remove element
set.contains("A");              // Check if contains
set.size();                     // Get size
set.isEmpty();                  // Check if empty

// Bulk Operations
set.addAll(collection);         // Add all from collection
set.retainAll(collection);      // Retain only common elements
set.removeAll(collection);      // Remove all from collection
set.clear();                    // Remove all elements
```

---

#### 10.2.1 HashSet

**Definition**: Hash table implementation of Set interface.

**Features:**
- No order guarantee
- Allows one null element
- O(1) time complexity for add, remove, contains (average)

**When to Use:**
- Fast lookups needed
- Order doesn't matter
- Need unique elements

---

#### 10.2.2 LinkedHashSet

**Features:**
- Maintains insertion order
- Allows one null element
- Slightly slower than HashSet

**When to Use:**
- Need unique elements with insertion order

---

#### 10.2.3 TreeSet

**Features:**
- Keeps elements in sorted order
- Does NOT allow null elements
- O(log n) time complexity for operations

**When to Use:**
- Need sorted unique elements

#### Set Implementation Comparison:

| Feature | HashSet | LinkedHashSet | TreeSet |
|---------|---------|---------------|---------|
| Order | No order | Insertion order | Sorted order |
| Null Elements | Allows one | Allows one | Does not allow |
| Performance | O(1) | Slightly slower | O(log n) |
| Use Case | Fast lookups | Insertion order + fast | Sorted + unique |

---

### 10.3 Queue Interface

#### Definition
The Queue interface represents a collection designed for holding elements before processing.

**Key Features:**
- Follows **FIFO** (First-In-First-Out) principle by default
- Some implementations (PriorityQueue) order based on priority

#### Common Methods:

**Insertion:**
- `add(E e)`: Adds element, throws exception if queue is full
- `offer(E e)`: Adds element, returns false if queue is full

**Removal:**
- `remove()`: Removes and returns head, throws exception if empty
- `poll()`: Removes and returns head, returns null if empty

**Inspection:**
- `element()`: Returns head without removing, throws exception if empty
- `peek()`: Returns head without removing, returns null if empty

---

#### 10.3.1 PriorityQueue

**Features:**
- Elements ordered by priority (natural ordering or custom comparator)
- Does NOT allow null elements
- O(log n) for add() and poll()

**When to Use:**
- Need elements processed by priority

---

#### 10.3.2 Deque Interface (Double-Ended Queue)

**Definition**: Supports element insertion and removal at both ends.

**Implementations:**

##### ArrayDeque:
- Resizable array implementation
- O(1) for add, remove, peek operations
- Does NOT allow null
- Best for stack/queue operations

##### LinkedList (as Deque):
- Doubly-linked list implementation
- O(1) for add, remove, peek operations
- Allows null elements

**When to Use:**
- ArrayDeque: Resizable array-based double-ended queue
- LinkedList: Linked list-based double-ended queue

#### Queue Implementation Comparison:

| Feature | PriorityQueue | ArrayDeque | LinkedList |
|---------|---------------|------------|------------|
| Order | Priority-based | FIFO or LIFO | FIFO or LIFO |
| Null Elements | Not allowed | Not allowed | Allowed |
| Performance | O(log n) | O(1) | O(1) |
| Use Case | Priority queue | Double-ended queue | Double-ended queue |

---

### 10.4 Map Interface

#### Definition
The Map interface represents a collection of key-value pairs where:
- Each key is **unique**
- Each key maps to exactly **one value**
- Does NOT extend Collection interface

#### Common Methods:

**Basic Operations:**
```java
Map<String, Integer> map = new HashMap<>();

map.put("A", 1);                    // Add key-value pair
map.get("A");                       // Get value for key
map.remove("A");                    // Remove by key
map.containsKey("A");               // Check if key exists
map.containsValue(1);               // Check if value exists
map.size();                         // Get size
map.isEmpty();                      // Check if empty
```

**Bulk Operations:**
```java
map.putAll(anotherMap);             // Copy all entries
map.clear();                        // Remove all entries
```

**Views:**
```java
map.keySet();                       // Get all keys (Set)
map.values();                       // Get all values (Collection)
map.entrySet();                     // Get all entries (Set of Map.Entry)
```

**Iterating Through Map:**
```java
// 1. Using keySet()
for (String key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}

// 2. Using entrySet()
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

// 3. forEach (Java 8+)
map.forEach((key, value) -> System.out.println(key + " -> " + value));
```

---

#### 10.4.1 HashMap

**Features:**
- Stores key-value pairs in hash table
- No order guarantee
- Allows one null key and multiple null values
- O(1) time complexity for get() and put() (average)

**When to Use:**
- Fast lookups needed
- Order doesn't matter

---

#### 10.4.2 LinkedHashMap

**Features:**
- Maintains insertion order
- Slightly slower than HashMap

**When to Use:**
- Need to maintain insertion or access order

---

#### 10.4.3 TreeMap

**Features:**
- Maintains sorted order by keys
- Does NOT allow null keys
- O(log n) time complexity

**When to Use:**
- Need elements sorted by keys

---

#### 10.4.4 Hashtable (Legacy)

**Features:**
- Thread-safe (synchronized)
- Does NOT allow null keys or values
- Slower than HashMap

**When to Use:**
- Legacy code
- Use `ConcurrentHashMap` instead for modern applications

#### Map Implementation Comparison:

| Feature | HashMap | LinkedHashMap | TreeMap | Hashtable |
|---------|---------|---------------|---------|-----------|
| Order | No order | Insertion order | Sorted order | No order |
| Null Key/Value | 1 null key, multiple null values | 1 null key, multiple null values | No null keys | No null |
| Thread-Safe | No | No | No | Yes |
| Performance | O(1) | O(1) | O(log n) | O(1) |

---

### When to Use Which Collection?

| Collection | Use Case |
|------------|----------|
| **ArrayList** | Fast random access, read-heavy operations |
| **LinkedList** | Frequent insert/delete in middle |
| **Vector** | Thread-safe list (legacy, use `synchronizedList()` instead) |
| **Stack** | LIFO operations (prefer `ArrayDeque` instead) |
| **HashSet** | Unique elements, fastest lookup, order doesn't matter |
| **LinkedHashSet** | Unique elements with insertion order |
| **TreeSet** | Unique elements in sorted order |
| **PriorityQueue** | Elements processed by priority |
| **ArrayDeque** | Better stack & queue implementation |
| **LinkedList (Deque)** | Double-ended operations, frequent insertions/removals |
| **HashMap** | Fastest key-value lookup, order doesn't matter |
| **LinkedHashMap** | Key-value with insertion order |
| **TreeMap** | Key-value with sorted order |
| **Hashtable** | Thread-safe (prefer `ConcurrentHashMap`) |

### Best Practices:
✅ Use ArrayList for most list operations  
✅ Use HashMap for key-value storage  
✅ Use ConcurrentHashMap instead of Hashtable in multi-threaded environments  
✅ Use ArrayDeque instead of Stack for better performance

---

## 11. Multi-Threading

### Definition
Multi-threading is the ability to execute multiple threads (lightweight processes) concurrently, allowing better utilization of CPU resources.

### Thread Class Methods:

| Method | Description |
|--------|-------------|
| `setName(String name)` | Sets the name of the thread |
| `getName()` | Returns the name of the thread |
| `setPriority(int priority)` | Sets thread priority (1-10) |
| `getPriority()` | Returns thread priority |
| `isAlive()` | Checks if thread is still running |
| `run()` | Contains the logic of the thread |
| `start()` | Starts the thread and calls run() method |
| `sleep(long millis)` | Puts thread to sleep for specified milliseconds |
| `join()` | Makes one thread wait for another to finish |
| `yield()` | Temporarily pauses current thread to allow others to execute |
| `isInterrupted()` | Checks if thread has been interrupted |
| `interrupt()` | Interrupts the thread |

### Thread Priority Constants:

| Priority Level | Constant | Value |
|----------------|----------|-------|
| Minimum | `Thread.MIN_PRIORITY` | 1 |
| Normal | `Thread.NORM_PRIORITY` | 5 |
| Maximum | `Thread.MAX_PRIORITY` | 10 |

### Creating Threads:

**1. Extending Thread Class:**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

MyThread t1 = new MyThread();
t1.start();
```

**2. Implementing Runnable Interface:**
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

Thread t1 = new Thread(new MyRunnable());
t1.start();
```

### Important Notes:
- Always call `start()` to begin thread execution (not `run()` directly)
- Use `sleep()` for pausing execution
- Use `join()` to wait for thread completion
- Deprecated methods: `suspend()`, `resume()`, `stop()` (use modern alternatives)

---

## 12. Java Streams API

### Definition
A Stream is a sequence of elements from a source that supports aggregate operations. It's not a data structure but a pipeline of computational steps.

### Key Concepts:

#### Stream Characteristics:
- **Sequence of elements**: Operates on a sequence of specific type
- **Source**: Consumes from collections, arrays, or I/O resources
- **Aggregate operations**: Supports SQL-like operations (filter, map, reduce, etc.)
- **Pipelining**: Operations can be chained together
- **Automatic iteration**: Streams iterate internally over elements

### Advantages:
- **Functional Programming**: More concise and readable code
- **Parallelism**: Easy parallel processing with minimal code changes
- **Lazy Evaluation**: Intermediate operations execute only when terminal operation is invoked
- **Readability**: Declarative style vs imperative loops

### Collection vs Stream:

| Feature | Collections | Streams |
|---------|-------------|---------|
| **Traversal** | Multiple times | Typically once (consumed after terminal operation) |
| **Consumption** | Elements can be accessed, added, or removed | Elements consumed, cannot be mutated directly |
| **Data Storage** | Store elements and manage memory | Do not store; computed on demand |
| **Mutability** | Mutable | Immutable; operations return new streams |
| **When to Use** | Storing and managing objects | Processing sequences functionally |

---

### Stream Operations:

#### Intermediate Operations (Lazy):
Transform stream into another stream, executed only when terminal operation is invoked.

```java
filter(Predicate)         // Filter elements matching predicate
map(Function)             // Transform each element
flatMap(Function)         // Flatten stream of streams
sorted()                  // Sort elements
sorted(Comparator)        // Sort with custom comparator
distinct()                // Remove duplicates
peek(Consumer)            // Perform action on each element (for debugging)
limit(long)               // Limit to n elements
skip(long)                // Skip first n elements
```

#### Terminal Operations (Eager):
Produce a result or side-effect, consume the stream.

```java
forEach(Consumer)                    // Perform action on each element
collect(Collector)                   // Collect into collection/value
reduce(BinaryOperator)              // Reduce to single value
count()                             // Count elements
anyMatch(Predicate)                 // Check if any element matches
allMatch(Predicate)                 // Check if all elements match
noneMatch(Predicate)                // Check if no elements match
findFirst()                         // Find first element (returns Optional)
findAny()                           // Find any element (returns Optional)
min(Comparator) / max(Comparator)   // Find min/max (returns Optional)
toArray()                           // Convert to array
```

---

### Creating Streams:

```java
// From Collections
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();

// From Arrays
String[] array = {"a", "b", "c"};
Stream<String> stream = Arrays.stream(array);
Stream<String> stream = Stream.of(array);

// From Values
Stream<String> stream = Stream.of("a", "b", "c");

// Empty Stream
Stream<String> empty = Stream.empty();

// Generate Infinite Stream (must limit)
Stream<String> generated = Stream.generate(() -> "element").limit(10);

// Iterate (must limit)
Stream<Integer> iterated = Stream.iterate(0, n -> n + 2).limit(10);

// Primitive Streams
IntStream intStream = IntStream.range(1, 5);        // 1, 2, 3, 4
IntStream intStream = IntStream.rangeClosed(1, 5);  // 1, 2, 3, 4, 5

// From Strings
IntStream chars = "abc".chars();  // ASCII values
Stream<String> words = Pattern.compile(", ").splitAsStream("a, b, c");

// From Files
Stream<String> lines = Files.lines(Paths.get("file.txt"));
```

---

### Common Collectors:

```java
// To List
List<String> list = stream.collect(Collectors.toList());

// To Set
Set<String> set = stream.collect(Collectors.toSet());

// To Map
Map<Long, String> map = stream.collect(
    Collectors.toMap(obj::getId, obj::getName)
);

// Joining Strings
String joined = stream.collect(Collectors.joining(", "));

// Grouping By
Map<Department, List<Employee>> byDept = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment));

// Grouping and Counting
Map<Department, Long> countByDept = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

// Partitioning By (Boolean Map)
Map<Boolean, List<Student>> passFail = students.stream()
    .collect(Collectors.partitioningBy(s -> s.getGrade() >= 60));

// Counting
long count = stream.collect(Collectors.counting());

// Summing
int totalAge = persons.stream()
    .collect(Collectors.summingInt(Person::getAge));

// Averaging
double avgScore = students.stream()
    .collect(Collectors.averagingDouble(Student::getScore));

// Statistics
IntSummaryStatistics stats = persons.stream()
    .collect(Collectors.summarizingInt(Person::getAge));
```

---

### Lazy Evaluation:
Intermediate operations are NOT executed until terminal operation is invoked. This improves performance by:
- Avoiding unnecessary computations
- Processing infinite streams efficiently
- Enabling optimization by stream engine

**Example:**
```java
List<String> list = Arrays.asList("abc1", "abc2", "abc3");
Optional<String> result = list.stream()
    .filter(element -> {
        System.out.println("filter: " + element);
        return element.contains("2");
    })
    .map(element -> {
        System.out.println("map: " + element);
        return element.toUpperCase();
    })
    .findFirst();
// Only processes until "abc2" is found
```

---

### Short-circuiting Operations:
Operations that may NOT need to process all elements.

**Intermediate:** `limit(n)`, `takeWhile(predicate)` (Java 9+)

**Terminal:** `anyMatch()`, `allMatch()`, `noneMatch()`, `findFirst()`, `findAny()`

---

### Parallel Streams:

**Create Parallel Stream:**
```java
collection.parallelStream()
stream.parallel()
```

**Advantages:**
- Performance boost for large datasets
- Utilizes multi-core processors
- Simplified parallelism

**Disadvantages:**
- Overhead for small datasets
- Shared mutable state can cause race conditions
- Order not guaranteed (unless using `forEachOrdered`)
- Blocking operations can hinder performance

**When to Use:**
✅ Large datasets  
✅ Computationally intensive operations  
✅ Independent and stateless operations  
✅ Efficiently splittable sources (ArrayList, arrays)

**Avoid When:**
❌ Small datasets  
❌ Shared mutable state  
❌ Order-critical operations  
❌ Blocking I/O operations

**Underlying Framework:** Fork/Join Framework using `ForkJoinPool.commonPool()`

---

### Stateless vs Stateful Operations:

**Stateless:** Processing doesn't depend on other elements
- Examples: `filter()`, `map()`, `flatMap()`, `peek()`
- Efficient and easy to parallelize

**Stateful:** Processing depends on other elements
- Examples: `distinct()`, `sorted()`, `limit()`, `skip()`
- May require buffering, higher overhead

---

### Optional Class:
Container object that may or may not contain a non-null value. Used to handle potentially absent values elegantly.

**Common Methods:**
```java
Optional<String> opt = stream.findFirst();

opt.isPresent()                    // Check if value present
opt.get()                          // Get value (throws if empty)
opt.orElse("default")             // Get value or default
opt.orElseGet(() -> "default")    // Get value or from supplier
opt.orElseThrow(() -> new Exception())  // Get or throw exception
opt.ifPresent(val -> print(val))  // Execute if present
opt.map(String::toUpperCase)      // Transform if present
```

**Benefits:**
- Explicitly represents absence of value
- Avoids NullPointerExceptions
- Provides fluent API for handling absence
- Improves code readability

---

### Java 9+ Stream Enhancements:

**takeWhile():** Takes elements while predicate is true, stops when false
```java
Stream.of(1, 2, 3, 4, 1, 2)
    .takeWhile(n -> n < 4)  // Results: 1, 2, 3
```

**dropWhile():** Drops elements while predicate is true, includes rest
```java
Stream.of(1, 2, 3, 4, 1, 2)
    .dropWhile(n -> n < 4)  // Results: 4, 1, 2
```

**Stream.iterate() with predicate (Java 9):**
```java
// Java 8 (needed limit)
Stream.iterate(0, n -> n + 1).limit(10)

// Java 9+ (built-in predicate)
Stream.iterate(0, n -> n < 10, n -> n + 1)
```

**Stream.ofNullable() (Java 9+):**
```java
Stream<String> stream = Stream.ofNullable(nullableValue);
// Returns empty stream if null, otherwise stream with single element
```

---

## 13. Interview Questions & Answers

### 📌 Core Java Basics

**Q1: What is JDK, JRE, and JVM?**
- **JDK (Java Development Kit)**: Complete development kit with compiler, debugger, and tools for developing Java applications
- **JRE (Java Runtime Environment)**: Runtime environment containing JVM and libraries needed to run Java applications
- **JVM (Java Virtual Machine)**: Virtual machine that executes Java bytecode, provides platform independence

**Q2: What is the difference between `==` and `.equals()`?**
- `==`: Compares object references (memory addresses)
- `.equals()`: Compares object content/values (can be overridden for custom comparison)

**Q3: What is the difference between String, StringBuilder, and StringBuffer?**
- **String**: Immutable, thread-safe, creates new object on modification
- **StringBuilder**: Mutable, NOT thread-safe, faster for single-threaded operations
- **StringBuffer**: Mutable, thread-safe (synchronized), slower due to synchronization

---

### 📌 OOPs Concepts

**Q4: What are the four pillars of OOPs?**
1. **Encapsulation**: Data hiding using private fields and public methods
2. **Inheritance**: Acquiring properties and methods from parent class
3. **Polymorphism**: Same method behaving differently (overloading/overriding)
4. **Abstraction**: Hiding implementation details, showing only functionality

**Q5: What is the difference between Abstract Class and Interface?**

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| Methods | Can have abstract and concrete methods | Only abstract methods (Java 8+ allows default/static) |
| Variables | Can have instance variables | Only public static final constants |
| Constructor | Can have constructors | Cannot have constructors |
| Multiple Inheritance | Single inheritance only | Can implement multiple interfaces |
| Access Modifiers | Can use any access modifier | Methods are public by default |

**Q6: What is method overloading and overriding?**
- **Overloading (Compile-time Polymorphism)**: Same method name, different parameters in same class
- **Overriding (Runtime Polymorphism)**: Subclass provides specific implementation of parent class method

**Q7: Can we override static methods?**
No, static methods belong to the class, not the object. They can be hidden but not overridden.

**Q8: What is the `super` keyword?**
Refers to the immediate parent class object. Used to:
- Access parent class methods: `super.methodName()`
- Access parent class variables: `super.variableName`
- Call parent class constructor: `super()`

**Q9: What is the `this` keyword?**
Refers to the current object instance. Used to:
- Differentiate between instance variables and parameters
- Call other constructors in the same class
- Pass current object as parameter

**Q10: What is the `final` keyword?**
- **final variable**: Constant, cannot be changed
- **final method**: Cannot be overridden
- **final class**: Cannot be inherited

---

### 📌 Exception Handling

**Q11: What is the difference between Checked and Unchecked exceptions?**
- **Checked Exception**: Checked at compile-time, must be handled (IOException, SQLException)
- **Unchecked Exception**: Runtime exceptions, not checked at compile-time (NullPointerException, ArithmeticException)

**Q12: What is the difference between `throw` and `throws`?**
- **throw**: Used to explicitly throw an exception
- **throws**: Used in method signature to declare exceptions that method might throw

**Q13: Can we have `try` without `catch`?**
Yes, if `finally` block is present: `try { } finally { }`

**Q14: What is the purpose of `finally` block?**
Executes regardless of whether exception occurs or not. Used for cleanup activities (closing resources).

---

### 📌 Collections Framework

**Q15: What is the difference between ArrayList and LinkedList?**

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| Structure | Dynamic array | Doubly linked list |
| Access Time | O(1) for random access | O(n) for random access |
| Insertion/Deletion | O(n) in middle | O(1) at ends |
| Memory | Less memory overhead | More memory (stores pointers) |
| Best Use | Random access, read-heavy | Frequent insertions/deletions |

**Q16: What is the difference between HashSet and TreeSet?**

| Feature | HashSet | TreeSet |
|---------|---------|---------|
| Order | No order | Sorted order |
| Performance | O(1) | O(log n) |
| Null Elements | Allows one null | Does not allow null |
| Implementation | Hash table | Red-Black tree |

**Q17: What is the difference between HashMap and Hashtable?**

| Feature | HashMap | Hashtable |
|---------|---------|-----------|
| Thread-Safe | No | Yes (synchronized) |
| Null Keys/Values | Allows 1 null key, multiple null values | Does not allow null |
| Performance | Faster | Slower (due to synchronization) |
| Legacy | No | Yes (prefer ConcurrentHashMap) |

**Q18: What is the difference between `fail-fast` and `fail-safe` iterators?**
- **Fail-fast**: Throws `ConcurrentModificationException` if collection is modified during iteration (ArrayList, HashMap)
- **Fail-safe**: Works on clone, doesn't throw exception (CopyOnWriteArrayList, ConcurrentHashMap)

**Q19: What is the difference between `Comparable` and `Comparator`?**
- **Comparable**: Natural ordering, implements `compareTo()`, modifies the class
- **Comparator**: Custom ordering, implements `compare()`, separate class for comparison

**Q20: What is the difference between `Collection` and `Collections`?**
- **Collection**: Interface, root of collection hierarchy
- **Collections**: Utility class with static methods for collection operations (sort, reverse, etc.)

---

### 📌 Multi-Threading

**Q21: What is the difference between `process` and `thread`?**
- **Process**: Independent program with own memory space
- **Thread**: Lightweight subprocess, shares memory with other threads of same process

**Q22: What are the ways to create a thread?**
1. Extending `Thread` class
2. Implementing `Runnable` interface
3. Implementing `Callable` interface (returns result)
4. Using Executor framework

**Q23: What is the difference between `start()` and `run()` methods?**
- **start()**: Creates new thread and calls `run()` method
- **run()**: Contains thread logic, if called directly executes in same thread (no new thread created)

**Q24: What is synchronization? Why is it needed?**
Mechanism to control access to shared resources by multiple threads, prevents race conditions and data inconsistency.

**Q25: What is deadlock? How to avoid it?**
- **Deadlock**: Two or more threads waiting for each other to release resources
- **Avoid by**: Lock ordering, timeout, deadlock detection algorithms

**Q26: What is the difference between `wait()` and `sleep()`?**
- **wait()**: Releases lock, must be called in synchronized context, woken by `notify()`/`notifyAll()`
- **sleep()**: Doesn't release lock, thread sleeps for specified time

---

### 📌 Java Streams API

**Q27: What is a Stream in Java?**
A sequence of elements from a source supporting aggregate operations. Not a data structure but a pipeline of computations.

**Q28: What is the difference between Collection and Stream?**
- **Collection**: Stores data, can be traversed multiple times, external iteration
- **Stream**: Processes data, typically traversed once, internal iteration, lazy evaluation

**Q29: What are intermediate and terminal operations?**
- **Intermediate**: Lazy, return new stream (filter, map, sorted)
- **Terminal**: Eager, produce result and consume stream (collect, forEach, reduce)

**Q30: Can a Stream be reused?**
No, once a terminal operation is performed, the stream is consumed and cannot be reused.

**Q31: What is the difference between `map()` and `flatMap()`?**
- **map()**: Transforms each element to another element (one-to-one)
- **flatMap()**: Transforms each element to stream and flattens (one-to-many)

**Q32: What is lazy evaluation in Streams?**
Intermediate operations are not executed until terminal operation is invoked, improving performance by avoiding unnecessary computations.

**Q33: What are short-circuiting operations?**
Operations that may not process all elements to produce result: `anyMatch()`, `allMatch()`, `findFirst()`, `limit()`

**Q34: When to use parallel streams?**
- ✅ Large datasets
- ✅ Computationally intensive operations
- ✅ Independent, stateless operations
- ❌ Avoid for small datasets, shared mutable state, order-critical operations

**Q35: What is the difference between `findFirst()` and `findAny()`?**
- **findFirst()**: Returns first element in encounter order
- **findAny()**: Returns any element (useful in parallel streams for better performance)

---

### 📌 Advanced Java

**Q36: What is the difference between `Serializable` and `Externalizable`?**
- **Serializable**: Marker interface, automatic serialization
- **Externalizable**: Requires implementing `writeExternal()` and `readExternal()`, custom serialization

**Q37: What are access modifiers in Java?**
- **public**: Accessible everywhere
- **protected**: Accessible in same package and subclasses
- **default (package-private)**: Accessible only in same package
- **private**: Accessible only within same class

**Q38: What is the difference between `static` and `instance` variables?**
- **Static**: Belongs to class, shared among all instances, one copy
- **Instance**: Belongs to object, each instance has its own copy

**Q39: What is a constructor? Can it be overloaded?**
Special method to initialize objects, same name as class, no return type. Yes, can be overloaded with different parameters.

**Q40: What is garbage collection?**
Automatic memory management process that identifies and removes unused objects to free memory. Handled by JVM.

**Q41: What is the difference between `break` and `continue`?**
- **break**: Exits the loop completely
- **continue**: Skips current iteration, continues with next iteration

**Q42: What is autoboxing and unboxing?**
- **Autoboxing**: Automatic conversion of primitive to wrapper object (int → Integer)
- **Unboxing**: Automatic conversion of wrapper object to primitive (Integer → int)

**Q43: What is Optional in Java 8?**
Container object that may or may not contain a non-null value, used to avoid NullPointerExceptions and handle absent values elegantly.

**Q44: What are lambda expressions?**
Anonymous functions that enable functional programming, used to implement functional interfaces concisely.
```java
// Before Java 8
Runnable r = new Runnable() {
    public void run() { System.out.println("Hello"); }
};

// With Lambda
Runnable r = () -> System.out.println("Hello");
```

**Q45: What are functional interfaces?**
Interfaces with exactly one abstract method, can be implemented using lambda expressions. Annotated with `@FunctionalInterface`.

**Q46: What is method reference?**
Shorthand notation of lambda expression to call a method. Types:
- Static method: `ClassName::staticMethod`
- Instance method: `object::instanceMethod`
- Constructor: `ClassName::new`

**Q47: What is the difference between `Array` and `ArrayList`?**
- **Array**: Fixed size, can store primitives and objects, less memory
- **ArrayList**: Dynamic size, stores only objects, more memory (wrapper overhead)

**Q48: What is type erasure?**
Process where generic type information is removed at runtime by compiler, replaced with bounds or Object. Ensures backward compatibility.

**Q49: What is the difference between `Iterator` and `ListIterator`?**
- **Iterator**: Traverse in forward direction only, works with all collections
- **ListIterator**: Traverse in both directions, add/remove/replace elements, only for List

**Q50: What is the Singleton design pattern?**
Ensures a class has only one instance and provides global access point. Implementation:
```java
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## 🎯 Conclusion

This repository contains comprehensive coverage of Core Java concepts from basics to advanced topics. Each section includes:
- ✅ Detailed theory and explanations
- ✅ Practical code examples
- ✅ Best practices and use cases
- ✅ Common interview questions

### Topics Covered:
1. Java Fundamentals (Data Types, Operators, Control Flow)
2. Object-Oriented Programming (OOPs)
3. Exception Handling
4. Collections Framework
5. Multi-Threading
6. Java 8+ Features (Streams, Lambda, Optional)

### 📂 Project Structure:
```
Core-Java/
├── Introduction/
├── PrimitiveDataTypes/
├── ConditionalStatements/
├── Loops/
├── Functions/
├── Arrays/
├── OOPS/
├── Interface/
├── Abstraction/
├── ExceptionHandling/
├── CollectionFramework/
│   ├── ListInterface/
│   ├── SetInterface/
│   ├── QueueInterface/
│   └── MapInterface/
├── MultiThreading/
├── JavaStreams/
└── Practice/
```

### 🚀 Happy Learning!
**Keep practicing and exploring Java concepts to become a proficient Java developer!**

---

*Last Updated: October 2025*

