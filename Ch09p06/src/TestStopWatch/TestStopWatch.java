/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStopWatch;
import java.util.*;
/**
 *
 * @author mitch
 */

public class TestStopWatch {
    public static void main(String [] args) {
    StopWatch  StopWatch  = new StopWatch();    
    double [] boi = new double [100000];
    for(int i = 0; i < boi.length; i ++) {
    boi[i] = Math.random();
    
    }
    
    StopWatch.start();
    bubblesort(boi, boi.length);
    StopWatch.stop();
    System.out.println("Sorting 100,000 numbers took " + StopWatch.getElapsedTime() + " milliseconds");

    
    }
    
    public static void bubblesort(double nums[], int listsize)    {
    int uses = 0;
    //copy the original array for testing
    double [] boi = new double[listsize];
    for(int i = 0; i < listsize; i ++) {
        boi[i] = nums[i];
    }
    
    //create the passing mechanism
    for(int i = 0;  i < listsize; i ++) {
double Temp;
    for( int j = 0; j <listsize; j++) {
        if(nums[i] < nums[j]) {
            Temp = nums[i];
        nums[i] = nums[j];
        nums[j]=Temp;
    }
}

    
}

    }
}

 class StopWatch {
    //data fields
    private long startTime;
    private long endTime;
    
    //constructor
    StopWatch() {
        startTime =System.currentTimeMillis();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
    }
    
    void start () {
        startTime = System.currentTimeMillis();
    }
    void stop () {
        endTime = System.currentTimeMillis();
    }
    long getElapsedTime() {
        return endTime - startTime;
    }
}
