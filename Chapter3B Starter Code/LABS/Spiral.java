package LABS;

import java.util.*;
import TurtleGraphics.StandardPen;

/**
 * Write a description of class Spiral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spiral
{
    public static void main(String[]args){
        
        double t, xPos, yPos;//initializing doubles
        
        StandardPen pen = new StandardPen(); //initializing pen
        
        pen.home(); //setting pen at origin 
        
        
        for (int i = 0; i < 10000; i++){ //for loop designed to run 10000 times
            
            t = Math.toRadians(i);
            xPos = t * Math.cos(t);
            yPos = t * Math.sin(t);
            
            pen.move(xPos,yPos); //moving the pen
        }
        
        
    }
}
