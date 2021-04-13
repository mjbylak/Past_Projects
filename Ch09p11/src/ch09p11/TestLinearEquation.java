/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09p11;
import java.util.*;
/**
 *
 * @author mitch
 */
public class TestLinearEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input your a, b, c, d, e, and f values: ");
        double a = scnr.nextDouble();
        double b = scnr.nextDouble();
        double c = scnr.nextDouble();
        double d = scnr.nextDouble();
        double e = scnr.nextDouble();
        double f = scnr.nextDouble();
        LinearEquation test = new LinearEquation(a, b ,c,d,e,f);
        if (test.isSolvable())
        System.out.println("Solutions are: " + test.getY() + " and "+ test.getX());
        else System.out.println("Your equation is not solvable");
    }
    
}

class LinearEquation  {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
        a = newA;
        b = newB;
        c = newC;
        d = newD;
        e = newE;
        f = newF;
    }
    
    double getA (){
    return a;
}
    double getB (){
    return b;
}
    double getC (){
    return c;
}
    double getD (){
    return d;
}
    double getE (){
    return e;
}
    double getF (){
    return f;
}
 boolean isSolvable() {
     if ((a*d-b*c) == 0) {
     return false;
     }
     else return true;
 }
 double getX(){
     return (e*d-b*f)/(a*d-b*c);
 }
 double getY() {
     return (a*f-e*c)/(a*d-b*c);
 }
}
