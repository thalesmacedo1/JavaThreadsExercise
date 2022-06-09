package com.threadExercise;

public class MyRunnableThread implements Runnable{
    private String name;
    private int time;

    public MyRunnableThread (String name, int time){
        this.name = name;
        this.time = time;
        // Thread t1 = new Thread(this);
        // t1.start();
    }

    @Override
    public void run() {
        try {
            for(int i=0; i<6; i++) {
                System.out.println("Executing " + name + "!!! " + i);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has ended!!!");
    }
}
