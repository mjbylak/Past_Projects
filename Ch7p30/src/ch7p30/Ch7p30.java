/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7p30;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch7p30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       System.out.println("Please input number of elements in list");
       int num = scnr.nextInt();
       int [] list = new int [num];
       System.out.println("Please input the list");
       for(int i =0; i < num; i ++) {
           list[i] = scnr.nextInt();
       }
       if (isConsecutiveFour(list) == true)
           System.out.println("The list has four consecutive fours");
       else System.out.println("The list does not have four consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] list) {
        for(int i = 0; i < list.length-3; i++) {
            if (list[i] == list[i+1] && list[i] == list[i+2] && list[i] == list[i+3])
                return true;
        }
        return false;
    }
    
}
