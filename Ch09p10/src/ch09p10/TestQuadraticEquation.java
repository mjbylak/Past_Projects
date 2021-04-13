/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09p10;
import java.util.*;
/**
 *
 * @author mitch
 */
public class TestQuadraticEquation {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your a, b, and c values");
        double a = scnr.nextDouble();
        double b = scnr.nextDouble();
        double c = scnr.nextDouble();
        QuadraticEquation test = new QuadraticEquation(a, b ,c);
        if(test.getDiscriminant() < 0) {
            System.out.println("There are no roots");
        }
        else if(test.getDiscriminant() == 0) {
            System.out.println("There is one root: " + test.getRoot1());
        }
        else System.out.println("There are two roots: " + test.getRoot1() + "and " + test.getRoot2());
    }
    
}

class QuadraticEquation {
    
    private double a;
    private double b;
    private double c;
    
    //what does constructor with arguments for a b c mean
    
     public QuadraticEquation  (double newA, double newB, double newC) {
    a = newA;
    b = newB;
    c = newC;
}
    double getA() {
        return a;
    }
    
    double getC() {
        return c;
    }
    
    double getB() {
        return b;
    }
    
    
    double getDiscriminant () {
       return b*b - 4*a*c; 
    }
    double getRoot1() {
        return (-1*b + (Math.sqrt(b*b-4*a*c)))/(2*a);
    }
    double getRoot2() {
        return (-1*b - (Math.sqrt(b*b-4*a*c)))/(2*a);
    }
    
}