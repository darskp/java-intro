// Multi-Threading:

// - Thread: Thread is a small, lightweight subprocess or subtask.
// - The process of executing multiple threads at a time is called multi-threading.
// - A thread runs in a separate path of execution.
// - Thread is a predefined class present in "java.lang" and introduced from JDK 1.0.

// Properties of a thread:
// a) Thread ID - Thread ID is used to identify a thread uniquely.
// b) Thread Name - Thread name is used to identify a thread easily.
// c) Thread Priority - Thread priority is used to decide the execution order of a thread.
//    Thread priority ranges from 1 to 10.
//    Default is 5.
//    1 is the least priority.

// Note: Thread ID, Thread Name, Priority are private, and all private data members in the Thread class.

// Important methods present in the Thread class:
// 1. getId()
// 2. getName()
// 3. setName()
// 4. getPriority()
// 5. setPriority()
// 6. run()
// 7. start()
// 8. sleep()
// 9. stop()
// 10. currentThread()

// Constructors present in the Thread class:
// 1. Thread()
// 2. Thread(String name)
// 3. Thread(Runnable obj)
// 4. Thread(Runnable obj, String name)

// Pre-Defined Threads:
// Java is a multi-threaded language, and when we execute it, it starts as a single thread, but internally, Java program executes threads.

// 1. Main Thread
// 2. Thread Scheduler
// 3. Garbage Collector

// - Main thread is used to start or begin the execution of the program.
// - Thread Scheduler is used to manage all the threads.
// - Garbage Collector is used to delete all the unused or dereferenced objects from the memory.

// User-Defined Thread:
// - We can create a thread in two ways:
// 1. Using the Thread class
// 2. Using the Runnable interface
