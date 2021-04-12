/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p18;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch8p18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = scnr.nextInt();
        int [] [] boi = new int [r] [2]; 
        System.out.println("Enter the array");
        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < 2; j ++) {
                boi [i][j] = scnr.nextInt();
            }
        }
    shuffle(boi);
        System.out.println("shuffled array:");
    for (int i = 0; i < r; i ++) {
            for (int j = 0; j < 2; j ++) {
                System.out.print(boi[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void shuffle(int [] [] boi) {
        
        for (int j = 0; j < 100; j ++) {
        int l = (int)(10*Math.random());
            int i = (int)(10*Math.random());
            for (int k = 0; k  <20; k++) {
            if (i < 0 || i > boi.length-1) {
                i = (int)(10*Math.random());
            }
            if (l < 0 || l > boi.length-1) {
                l = (int)(10*Math.random());
            }
            }
            int temp = boi[i][0];
                boi[i][0] = boi[l][0];
                boi[l][0] = temp;
                int oo = boi[i][1];
                boi[i][1] = boi[l][1];
                boi[l][1] = oo;
        }
    }
}
