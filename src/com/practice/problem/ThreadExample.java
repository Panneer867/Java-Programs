package com.practice.problem;
// Class to create a thread by extending the Thread class
class Task1 extends Thread {
    public void run() {
        try {
            System.out.println("Task 1 is starting...");
            Thread.sleep(1000);  // Simulate a task taking time
            System.out.println("Task 1 is completed!");
        } catch (InterruptedException e) {
            System.out.println("Task 1 was interrupted!");
        }
    }
}

// Class to create another thread by extending the Thread class
class Task2 extends Thread {
    public void run() {
        try {
            System.out.println("Task 2 is starting...");
            Thread.sleep(1500);  // Simulate a task taking more time
            System.out.println("Task 2 is completed!");
        } catch (InterruptedException e) {
            System.out.println("Task 2 was interrupted!");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create instances of Task1 and Task2 threads
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        // Start both tasks
        task1.start();
        task2.start();

        // Main thread continues to run independently
        System.out.println("Main thread is running...");

        try {
            // Wait for both tasks to finish before exiting the main method
            task1.join();  
            task2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted!");
        }

        // After both tasks are finished
        System.out.println("Main thread has completed execution.");
    }
}
