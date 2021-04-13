/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11p13;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mitch
 */
public class Ch11p13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter 10 integers");
        ArrayList<Integer> list;
        list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int value = scnr.nextInt();
            list.add(value);
        }
        removeDuplicate(list);
        System.out.println("The list without duplicates:");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int j = 0; j < 20; j ++) {
            for (int i = 0; i < list.size(); i++) {
        if(list.lastIndexOf(list.get(i)) != list.indexOf(list.get(i))) {
            list.remove(list.lastIndexOf(list.get(i)));
        }
            }
        
            }
    }
    
}
