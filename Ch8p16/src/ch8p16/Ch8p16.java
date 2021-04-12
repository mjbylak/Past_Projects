/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p16;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch8p16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = scnr.nextInt();
        int [] [] boi = new int [r] [2]; 
        System.out.println("Enter the array");
        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < 2; j ++) {
                boi [i][j] = scnr.nextInt();
            }
        }
    sort (boi);
    System.out.println("The sorted array:");
    for (int i = 0; i < r; i ++) {
            for (int j = 0; j < 2; j ++) {
                System.out.print(boi[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void sort (int boi [] [] ) {
        int index = 0;
        for (int p = 0; p < 12; p++) {
        for (int i = 0; i < boi.length-1; i ++){
            if (boi[i][0] > boi[i+1][0]) {
                
                int temp = boi[i][0];
                boi[i][0] = boi[i+1][0];
                boi[i+1][0] = temp;
                int oo = boi[i][1];
                boi[i][1] = boi[i+1][1];
                boi[i+1][1] = oo;
            }
            if (boi[i][0] == boi[i+1][0]) {
                if (boi[i][1] > boi[i+1][1]) {
                int temp = boi[i][0];
                boi[i][0] = boi[i+1][0];
                boi[i+1][0] = temp;
                int oo = boi[i][1];
                boi[i][1] = boi[i+1][1];
                boi[i+1][1] = oo;
                }
    }
        }
        
        }
}

}
