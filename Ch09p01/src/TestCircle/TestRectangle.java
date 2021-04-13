/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCircle;
import java.util.*;
/**
 *
 * @author mitch
 */
 class Ch09p012 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Rectangle {
    //data field
    double width;
    double height;
    
    //constructor
    Rectangle () {
    }
    //constructor using width and height
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height= newHeight;
    }
   
    //method to get area
    double getArea() {
        return width*height;
    }
    //method to get perimeter
    double getPerimeter () {
        return 2*(height+width);
    }
}
    
    

public class TestRectangle {
    
public static void main(String [] args) {
    Rectangle rectangle1 = new Rectangle(4, 40);
    System.out.println("Rectangle 1 length is: " + rectangle1.width);
    System.out.println("Rectangle 1 width is: " + rectangle1.height);
    System.out.println("The area of Rectangle 1 is: "+rectangle1.getArea());
    System.out.println("The perimeter of Rectangle 1 is: "+ rectangle1.getPerimeter());
    
    Rectangle rectangle2 = new Rectangle(3.5,35.9);
    System.out.println("Rectangle 2 length is: " + rectangle2.width);
    System.out.println("Rectangle 2 width is: " + rectangle2.height);
    System.out.println("The area of Rectangle 2 is: "+rectangle2.getArea());
    System.out.println("The perimeter of Rectangle 2 is: "+ rectangle2.getPerimeter());

    }

}
