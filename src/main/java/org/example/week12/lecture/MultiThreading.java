package org.example.week12.lecture;


public class MultiThreading extends Thread {
    private int threadNumber;
    public MultiThreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i + " from " + threadNumber );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            MultiThreading myThread = new MultiThreading(i);
            myThread.start();
        }
    }
}
