/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11p11;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mitch
 */
public class Ch11p11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter five numbers: ");
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < 5; i ++) {
        list.add(scnr.nextInt());
    }
    sort(list);
    for(int i = 0; i < 5; i ++) {
        System.out.print(list.get(i) + " ");
    }
    }
    public static void sort(ArrayList<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            for(int i =0; i < list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                int swap = list.get(i);
                list.set(i,list.get(i+1));
                list.set((i+1),swap);
            }
        }
    }
    }
}
