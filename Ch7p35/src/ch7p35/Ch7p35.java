/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7p35;
import java.util.*;
/**
 *
 * @author mitch
 */
public class Ch7p35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Hangman:");
        
    //set list of words and pick random word
        String [] words = {"apples", "oranges", "pineapples", "pears", "mangos", "squidward", "monkey", "bottle", "water", "gatorade"};
        String theWord = words[(int)(Math.random()*10)];
        char [] hiddenWord = new char [theWord.length()];
        for(int i = 0; i < theWord.length(); i++) {
            hiddenWord[i] = '*';
        }
        
        
        
        
        //number of times guessed wrong ig
        int wrong = 0;
        
        
        
        //creating new array for each letter in the word to be guessed
        char [] Word = new char [theWord.length()];
        for(int i = 0; i < theWord.length(); i++){
        Word[i] = theWord.charAt(i);
        }
        
        //printing out hidden word with *'s
        System.out.print("(Guess) Enter a letter in word ");
        for(int i = 0; i < theWord.length(); i++) {
        System.out.print(hiddenWord[i]);
        }
        System.out.print(" > ");
        
        //has been guessed array
        char [] guessed = new char [50];

        
        //scanning letter input
        for(int x = 0; x < 300; x++) {
        //creating asterick
        String asterick = "*";
        char Asterick = asterick.charAt(0);
        
        
        //completion coding (very bad)
        int mmm = 0;
        for(int j = 0; j < theWord.length(); j++) {
        
            if(Character.toString(hiddenWord[j]).equals(asterick)) { 
            mmm++;    
            } 
            
        }
        if(mmm == 0)
            break;
        
        String letter = scnr.next();
        char Letter = letter.charAt(0);
        
        //comparing letter input
        boolean success = false;
        boolean hasbeenguessed = false;
        for(int i = 0; i < theWord.length(); i++) {
            for(int l = 0; l < guessed.length; l++) {
            if (Letter == guessed[i])
                hasbeenguessed = true;
            }    
            for(int l = 0; l < guessed.length; l++) {            
             if(Letter == (Word[i])) {
                hiddenWord[i] = letter.charAt(0);
                success = true;
            }
            }
        }
        if (success == false) {
        wrong++;
        System.out.println(Letter + " is not in the word.");
        }
        else if (success == true)
            System.out.println(Letter + " is in the word.");
        if (hasbeenguessed == true) 
            System.out.println(Letter + " has already been guessed.");
        
        //assigned to guessed
        guessed[x] = Letter;
        
        //printing word with parts 
        System.out.print("(Guess) Enter a letter in word ");
        for(int i = 0; i < theWord.length(); i++) {
        System.out.print(hiddenWord[i]);
        }
        System.out.print(" > ");
        }
    System.out.println();
    System.out.println("The word is " + theWord + ". You missed " + wrong + " time(s)");
    
}
}
