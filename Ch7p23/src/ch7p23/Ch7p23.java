/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7p23;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch7p23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean [] lockers = new boolean [100];
        
        for(int i = 1; i < 101; i++) {
            for(int j = 0; j<100; j++) {
                if(j%i == 0) {
                    
                    if (lockers[j] == false) {
                        
                        lockers[j] = true;
                    }
                    else if (lockers[j] == true) {
                        lockers[j] = false;
                    }
                    else System.out.println("why");
                }
            }
    }
        
        
        
        
        
        
        for(int i = 0; i <100; i++) {
            if (lockers[i] == true)
            System.out.println(i + " ");
        }
    }
}
