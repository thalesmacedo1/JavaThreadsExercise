package com.threadExercise;

public class Main {
    public static void main(String[] args){
        // MyThread thread = new MyThread("Thread #1", 900);
        // MyThread thread2 = new MyThread("Thread #2", 1100);

        MyRunnableThread thread1 = new MyRunnableThread("Thread #1", 600);
        MyRunnableThread thread2 = new MyRunnableThread("Thread #2", 1200);
        MyRunnableThread thread3 = new MyRunnableThread("Thread #3", 100);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY); // Pode ser um inteiro

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program finished!");
    }
}