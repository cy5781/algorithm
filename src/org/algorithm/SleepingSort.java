package org.algorithm;

/**
 * Created by ming on 2019/6/2.
 */
public class SleepingSort implements Runnable{

    private int number;

    public SleepingSort(int number){
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.number);
            System.out.println(this.number);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]){
        int numbers[] = {23,440,2,1222,60,58};
        for(int number :numbers){
            new Thread(new SleepingSort(number)).start();
        }
    }

}
