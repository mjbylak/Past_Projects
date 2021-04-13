/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8p20;
import java.util.*;

/**
 *
 * @author mitch
 */
public class Ch8p20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to connect four");
        char [] [] board = new char [6][7];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }
        
        
        System.out.println("|"+board[0][0]+"|"+board[0][1]+"|"+board[0][2]+"|"+board[0][3]+"|"+board[0][4]+"|"+board[0][5]+"|"+board[0][6]+"|");
        System.out.println("|"+board[1][0]+"|"+board[1][1]+"|"+board[1][2]+"|"+board[1][3]+"|"+board[1][4]+"|"+board[1][5]+"|"+board[1][6]+"|");
        System.out.println("|"+board[2][0]+"|"+board[2][1]+"|"+board[2][2]+"|"+board[2][3]+"|"+board[2][4]+"|"+board[2][5]+"|"+board[2][6]+"|");
        System.out.println("|"+board[3][0]+"|"+board[3][1]+"|"+board[3][2]+"|"+board[3][3]+"|"+board[3][4]+"|"+board[3][5]+"|"+board[3][6]+"|");
        System.out.println("|"+board[4][0]+"|"+board[4][1]+"|"+board[4][2]+"|"+board[4][3]+"|"+board[4][4]+"|"+board[4][5]+"|"+board[4][6]+"|");
        System.out.println("|"+board[5][0]+"|"+board[5][1]+"|"+board[5][2]+"|"+board[5][3]+"|"+board[5][4]+"|"+board[5][5]+"|"+board[5][6]+"|");
    
    //turn switcher
    for(int t= 0; t < 300; t++) {
        
    System.out.print("Drop a ");
    if(t%2 == 0)
        System.out.print("Red ");
    else System.out.print("Yellow ");
    System.out.print("disk at column (0-6): ");
    
    //spot dropping
int spot = scnr.nextInt();
while(spot >6 || spot <0) {
    System.out.println("That is not a valid space. Try again");
     spot = scnr.nextInt();
    }
for(int i = board.length-1; i >-1; i--) {
    if(board[i][spot] == ' ') {
        if(t%2 == 0)
        board[i][spot] = 'R';
        else board[i][spot] = 'Y';
    break;
}
}
System.out.println("|"+board[0][0]+"|"+board[0][1]+"|"+board[0][2]+"|"+board[0][3]+"|"+board[0][4]+"|"+board[0][5]+"|"+board[0][6]+"|");
        System.out.println("|"+board[1][0]+"|"+board[1][1]+"|"+board[1][2]+"|"+board[1][3]+"|"+board[1][4]+"|"+board[1][5]+"|"+board[1][6]+"|");
        System.out.println("|"+board[2][0]+"|"+board[2][1]+"|"+board[2][2]+"|"+board[2][3]+"|"+board[2][4]+"|"+board[2][5]+"|"+board[2][6]+"|");
        System.out.println("|"+board[3][0]+"|"+board[3][1]+"|"+board[3][2]+"|"+board[3][3]+"|"+board[3][4]+"|"+board[3][5]+"|"+board[3][6]+"|");
        System.out.println("|"+board[4][0]+"|"+board[4][1]+"|"+board[4][2]+"|"+board[4][3]+"|"+board[4][4]+"|"+board[4][5]+"|"+board[4][6]+"|");
        System.out.println("|"+board[5][0]+"|"+board[5][1]+"|"+board[5][2]+"|"+board[5][3]+"|"+board[5][4]+"|"+board[5][5]+"|"+board[5][6]+"|");
    if(isConsecutiveFour(board)) {
        if(t%2 == 0)
        System.out.print("Red ");
    else System.out.print("Yellow ");
        System.out.println("Wins");
        break;
    }
    }
}
 
    public static boolean isConsecutiveFour(char [] [] boi) {
        for(int i = 0; i < boi.length-3; i++) {
            for(int j = 0; j <boi[0].length; j++) {
            if (boi[i][j] != ' ' &&boi[i][j] == boi[i+1][j] && boi[i][j] == boi[i+2][j] && boi[i][j] == boi[i+3][j])
                return true;
            }
        }
        for(int j = 0; j < boi[0].length-3; j++) {
            for(int i = 0; i <boi.length; i++) {
            if (boi[i][j] != ' ' && boi[i][j] == boi[i][j+1] && boi[i][j] == boi[i][j+2]&& boi[i][j] == boi [i][j+3])
                return true;
            }
        }
        for(int j = 0; j < boi[0].length-3; j++) {
            for(int i = 0; i <boi.length-3; i++) {
            if (boi[i][j] != ' ' &&boi[i][j] == boi[i+1][j+1] && boi[i][j] == boi[i+2][j+2]&& boi[i][j] == boi [i+3][j+3])
                return true;
            }
        }
        int r = boi.length-1;
        int c = boi[0].length-1;
        for(int j = 0; j < boi[0].length-3; j++) {
            for(int i = 0; i <boi.length-3; i++) {
            if (boi[i][c-j] != ' ' && boi[i][c-j] == boi[i+1][c-(j+1)] && boi[i][c-j] == boi[i+2][c-(j+2)]&& boi[i][c-j] == boi [i+3][c-(j+3)])
                return true;
            }
        }
        
       return false;
    }
    
}