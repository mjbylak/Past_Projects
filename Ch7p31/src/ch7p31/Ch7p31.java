/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7p31;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch7p31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
       System.out.println("Please input number of elements in first list");
       int num1 = scnr.nextInt();
       int [] list1 = new int [num1];
       System.out.println("Please input the list");
       for(int i =0; i < num1; i ++) {
           list1[i] = scnr.nextInt();
       }
       System.out.println("Please input number of elements in second list");
       int num2 = scnr.nextInt();
       int [] list2 = new int [num2];
       System.out.println("Please input the list");
       for(int i =0; i < num2; i ++) {
           list2[i] = scnr.nextInt();
       }
       
       merge(list1, list2);
       for (int i = 0; i < merge(list1, list2).length; i++) {
           System.out.print(merge(list1, list2)[i] + " ");
       }
    }
    
    public static int [] merge(int [] list1, int [] list2) {
        int size1 = list1.length;
        int size2 = list2.length;
        int [] bigboi = new int [size1+size2];
        for (int i = 0; i < size1; i ++ ) {
            bigboi[i] = list1[i];
        }
        for(int i = 0; i < size2; i++) {
            bigboi[i+size1] = list2[i];
    }
    bubblesort(bigboi, bigboi.length);
    return bigboi;
}
    
public static void bubblesort(int nums[], int listsize)    {
    int uses = 0;
    //copy the original array for testing
    int [] boi = new int[listsize];
    for(int i = 0; i < listsize; i ++) {
        boi[i] = nums[i];
    }
    
    //create the passing mechanism
    for(int i = 0;  i < listsize; i ++) {
int Temp;
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
