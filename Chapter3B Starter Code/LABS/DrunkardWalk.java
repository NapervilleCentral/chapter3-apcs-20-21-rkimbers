package LABS;

import java.util.*;
import TurtleGraphics.StandardPen;
import java.lang.Math;

/**
 * Ryan Kimberley
 * APCS Per 5
 * Drunkard Walk
 */
public class DrunkardWalk
{
    public static void main(String[]args){
        
        
        Random gen = new Random();
        StandardPen pen = new StandardPen(); 
        pen.home(); //putting pen at orgin
        
        for (int i = 0; i <10000; i++){ //for loop that runs 10000x
            
            int choice = gen.nextInt(4); //random class to generate # 1-4
            
        if (choice == 1){//if choice is 1, pen goes right 100 px
                pen.turn(90);
                pen.move(100);
            }
        if (choice == 2){//if choice is 2, pen goes straight 100 px
                pen.move(100);
            }
        if (choice == 3){///if choice is 3, pen goes left 100 px
                pen.turn(-90);
                pen.move(100);
            }
        if (choice == 4){//if choice is 4, pen goes reverse 100 px
                pen.turn(180);
                pen.move(100);
        
        
        }
     }
    }
}
