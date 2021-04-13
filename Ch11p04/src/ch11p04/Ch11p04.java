/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11p04;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mitch
 */
public class Ch11p04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter integers (input ends with 0): ");
        int value;
        
        do {
            value = scnr.nextInt();
            if (value !=0){
                list.add(value);
            }
        } while (value!=0);
        
        //display the maximum number 
        System.out.println("The maximum number is " + max(list));
        
    }

public static Integer max(ArrayList <Integer> list) {
    if ((list == null) || list.size() == 0) {
        return null;
        
    }
    int result = list.get(0);
    for(int i = 0; i < list.size(); i++) {
    if(result < list.get(i)) {
        result =list.get(i);
    }
    
    }   
    return result;
}
}
