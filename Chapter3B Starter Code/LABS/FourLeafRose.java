package LABS;

import java.util.*;
import TurtleGraphics.StandardPen;
/*
 * Ryan Kimberley
 * APCS Per 5
 * Four Leaf Rose program
 */

public class FourLeafRose
{
    public static void main(String[] args)
    {
        double theta, r, xPos, yPos; //initializing doubles
        
        StandardPen pen = new StandardPen(); //initializing pen
        
        pen.home(); //setting pen at origin 
        
        
        for (int i = 0; i < 101; i++){ //for loop designed to run 100 times
            
            theta = i * 2 * Math.PI / 100; //setting value for theta
            r = Math.cos(2*theta);  //formula for 'r'
            xPos = 100 * r * Math.cos(theta);  //calculating new x,y coordinates
            yPos = 100 * r * Math.sin(theta);
            
            pen.move(xPos,yPos); //moving the pen
            }
        }
    }

