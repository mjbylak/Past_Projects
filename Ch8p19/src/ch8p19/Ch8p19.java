/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p19;

import java.util.Scanner;

/**
 *
 * @author mitch
 */
public class Ch8p19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of rows then columns in the array");
        int r = scnr.nextInt();
        int c = scnr.nextInt();
        int [] [] boi = new int [r] [c]; 
        System.out.println("Enter the array");
        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < c; j ++) {
                boi [i][j] = scnr.nextInt();
            }
        }
        System.out.println(isConsecutiveFour(boi));
    }
    
    public static boolean isConsecutiveFour(int [] [] boi) {
        for(int i = 0; i < boi.length-3; i++) {
            for(int j = 0; j <boi[0].length; j++) {
            if (boi[i][j] == boi[i+1][j] && boi[i][j] == boi[i+2][j] && boi[i][j] == boi[i+3][j])
                return true;
            }
        }
        for(int j = 0; j < boi[0].length-3; j++) {
            for(int i = 0; i <boi.length; i++) {
            if (boi[i][j] == boi[i][j+1] && boi[i][j] == boi[i][j+2]&& boi[i][j] == boi [i][j+3])
                return true;
            }
        }
        for(int j = 0; j < boi[0].length-3; j++) {
            for(int i = 0; i <boi.length-3; i++) {
            if (boi[i][j] == boi[i+1][j+1] && boi[i][j] == boi[i+2][j+2]&& boi[i][j] == boi [i+3][j+3])
                return true;
            }
        }
        int r = boi.length-1;
        int c = boi[0].length-1;
        for(int j = 0; j < boi[0].length-3; j++) {
            for(int i = 0; i <boi.length-3; i++) {
            if (boi[i][c-j] == boi[i+1][c-(j+1)] && boi[i][c-j] == boi[i+2][c-(j+2)]&& boi[i][c-j] == boi [i+3][c-(j+3)])
                return true;
            }
        }
        
       return false;
    }
}
