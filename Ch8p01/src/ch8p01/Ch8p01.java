/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p01;

import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch8p01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double [] [] boi = new double [3][4];
        for (int i = 0; i < boi.length; i++) {
            for (int j = 0; j < boi[1].length; j++) {
                boi[i][j] = scnr.nextDouble();
            }
        }
        for (int i = 0; i < boi.length; i++) {
            for (int j = 0; j < boi[1].length; j++) {
                System.out.print(boi[i][j] + " ");
            }
    System.out.println();
        }
    for (int i = 0; i < boi[1].length; i++) {
        System.out.println("Sum of the elements in column " + i + " " +String.format("%.2f",sumColumn(boi, i)));
    }
    }
    
   public static double sumColumn (double[][] m, int columnIndex) {
       double sum= 0;
       for(int i = 0; i < m.length; i ++) {
           sum+= m[i][columnIndex];
       }
       return sum;
    }
}
