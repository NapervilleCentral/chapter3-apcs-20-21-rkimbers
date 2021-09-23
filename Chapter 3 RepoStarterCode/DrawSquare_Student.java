


import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare_Student
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();

    // pen jumps to center of the graphics window
    //without drawing and points nort
    
    //pen.up();
    //pen.move(25);
    //pen.turn(90); pen.move(25);
    //pen.down();

    pen.setColor(Color.yellow);
    pen.setWidth(10);
    
    pen.turn(90);
    pen.move(130);
    
    pen.turn(90);
    pen.move(130);
    
    pen.setColor(Color.green);
    
    pen.turn(90);
    pen.move(130);
    
    pen.turn(90);
    pen.move(130);
    
    pen.turn(30);
    pen.move(130);
    
    pen.setColor(Color.yellow);
    pen.turn(120);
    pen.move(130);

    pen.home();

    

    
    //draw with pen

    //pick up pen

    // move back home

    //turn the pen

    //draw with pen



}
}