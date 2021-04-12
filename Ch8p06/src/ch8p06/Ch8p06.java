/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p06;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch8p06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr= new Scanner(System.in);
        System.out.println("Please input first 3x3 matrix");
        double [] [] boi = new double [3][3];
        for (int i = 0; i < boi.length; i++) {
            for (int j = 0; j < boi[1].length; j++) {
                boi[i][j] = scnr.nextDouble();
            }
        }
       
        System.out.println("Please input second 3x3 matrix");
        double [] [] bye = new double [3][3];
        for (int i = 0; i < bye.length; i++) {
            for (int j = 0; j < bye[1].length; j++) {
                bye[i][j] = scnr.nextDouble();
            }
        }
        
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
        System.out.print(String.format("%.2f",multiplyMatrix(boi, bye)[i][j]) + " ");
    }
            System.out.println();
        }
    }
    public static double [] [] multiplyMatrix(double [] [] a, double [] [] b) {
        double [] [] c = new double [3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                c [i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j] + a[i][2]*b[2][j];
            
            }
        }
        return c;
    }
}