/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p09;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch8p09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char [] [] tic = new char [3][3];
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                tic[i][j] = ' ';
            }
        }
        System.out.println("----------------");
        System.out.println("|  " + tic[0][0]+" |  " + tic[0][1]+" |  " + tic[0][2]+" |");
        System.out.println("----------------");
        System.out.println("|  " + tic[1][0]+" |  " + tic[1][1]+" |  " + tic[1][2]+" |");
        System.out.println("----------------");
        System.out.println("|  " + tic[2][0]+" |  " + tic[2][1]+" |  " + tic[2][2]+" |");
        System.out.println("----------------");
    
        for (int i = 0; i < 300; i ++) {
        
            if (i%2 ==0) 
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            else 
                    System.out.print("Enter a row (0, 1, or 2) for player O: ");
            
            int spotx = scnr.nextInt();
            while (spotx > 2 || spotx < 0) {
            
                System.out.println("really... you have one job. Its tic tac toe. Try again...");
            spotx = scnr.nextInt();
            }
                    
            if (i%2 ==0) 
            System.out.print("Enter a column (0, 1, or 2) for player X: ");
            else 
            System.out.print("Enter a column (0, 1, or 2) for player O: ");
            
            int spoty = scnr.nextInt();
            
            while (spoty > 2 || spoty < 0) {
            
                System.out.println("really... you have one job. Its tic tac toe. Try again...");
            spoty = scnr.nextInt();
            }
            if (tic[spotx][spoty] == ' ') {
                
            if (i%2 == 0)
                tic[spotx][spoty] = 'X';
            else
                tic[spotx][spoty] = 'O';
            }
            else System.out.println("That space is already taken. Get skipped");
            
            System.out.println("----------------");
        System.out.println("|  " + tic[0][0]+" |  " + tic[0][1]+" |  " + tic[0][2]+" |");
        System.out.println("----------------");
        System.out.println("|  " + tic[1][0]+" |  " + tic[1][1]+" |  " + tic[1][2]+" |");
        System.out.println("----------------");
        System.out.println("|  " + tic[2][0]+" |  " + tic[2][1]+" |  " + tic[2][2]+" |");
        System.out.println("----------------");
        
        boolean win = false;
        for(int p = 0; p < 3; p ++) {
        if (tic[p][0] != ' ' && tic[p][0] == tic[p][1] && tic[p][1] == tic[p][2]) 
        win = true;
        if (tic[0][p] != ' ' && tic[0][p] == tic[1][p] && tic[1][p] == tic[2][p])
            win = true;
        if (tic[0][0] != ' ' && tic[0][0] == tic[1][1] && tic[1][1] == tic[2][2])
            win  = true;
        if (tic[2][0] != ' ' && tic[0][2] == tic[1][1] && tic[1][1] == tic[2][0])
            win = true;
            }
        if (win == true) {
            if (i%2 == 0) 
                System.out.println("X wins");
            else
                System.out.println("O wins");
            break;
                    }
        
        }
    }
    
}
