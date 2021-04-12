/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7p26;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch7p26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input number of elements in lists");
        int num = scnr.nextInt();
        int [] list1 = new int [num];
        int [] list2 = new int [num];
        
        System.out.println("Please input the first list: ");
        for(int i =0; i < num; i++)
            list1[i] = scnr.nextInt();
        System.out.println("Please input the second list: ");
        for(int i =0; i < num; i++)
            list2[i] = scnr.nextInt();
        boolean istrue = true;
        istrue =equals(list1, list2);
        if (istrue == true)
            System.out.println("Two lists are strictly identical");
        else System.out.println("Two lists are not strictly identical");
    }
    
    public static boolean equals(int [] list1, int [] list2) {
        for(int i = 0; i < list1.length; i ++) {
            if (list1[i] != list2[i] )
                return false;
        }
        return true;
    }

    
}
