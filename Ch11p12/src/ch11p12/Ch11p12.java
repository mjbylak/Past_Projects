/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11p12;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mitch
 */
public class Ch11p12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter five numbers: ");
        Scanner scnr = new Scanner(System.in);
        ArrayList<Double> list= new ArrayList<>();
        for (int i = 0; i <5; i ++) {
            double value = scnr.nextDouble();
            list.add(value);
        }
        System.out.println("The sum of the list is: " + sum(list));
    }
    
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i ++) {
            
            sum += list.get(i);
        }
    return sum;
    }
}
