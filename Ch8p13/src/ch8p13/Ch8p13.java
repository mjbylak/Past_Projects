/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p13;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch8p13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of rows then columns in the array");
        int r = scnr.nextInt();
        int c = scnr.nextInt();
        double [] [] boi = new double [r] [c]; 
        System.out.println("Enter the array");
        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < c; j ++) {
                boi [i][j] = scnr.nextDouble();
            }
        }
    System.out.println("The location of the largest element is at (" + locateLargest(boi)[0]+ ", "+ locateLargest(boi)[1] + ")");
    }
    
    public static int [] locateLargest(double [] [] boi) {
        int [] big = new int [2];
        double biggest = Integer.MIN_VALUE;
        for (int i = 0; i < boi.length; i ++) {
            for (int j = 0; j < boi[0].length; j ++) {
                if (boi[i][j] > biggest) {
                    biggest = boi[i][j];
                    big[0] = i;
                    big[1] = j;
                }
            }
        }
        
        return big;
    }
}
