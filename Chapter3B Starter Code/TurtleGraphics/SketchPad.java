package TurtleGraphics;

import BreezySwing.GBPanel;
import java.awt.geom.*;
import java.util.*;
import java.awt.*;

public class SketchPad extends GBPanel {

   private java.util.List commands;
   private int counter;

// Constructors ----------------------------------

   public SketchPad(){
      commands = new java.util.LinkedList();
      setBackground (Color.white);
      counter = 1;
   }

// Public methods --------------------------------

   public void paintComponent(Graphics gg){
      try{
         super.paintComponent(gg);
         //System.out.println(counter++);
         Iterator iter = commands.iterator();
         while (iter.hasNext()){
            Command command = (Command) iter.next();
            command.doCommand((Graphics2D)gg, getWidth(), getHeight());
         }
      }catch(Exception e){
         //System.out.println("Paint exception " + counter++);
      }
   } 

   public void setColor(Color color){
      commands.add(new CommandSetColor(color));
   }

   public void setPenWidth(int width){
      commands.add(new CommandSetPenWidth(width));
   }

   public void drawLine( double x1, double x2, double x3, double x4, Color color, int width){
      commands.add(new CommandDrawLine(x1, x2, x3, x4));
      repaint();
   }
   
   public void drawString(String str, double x1, double x2, Color color){
      commands.add(new CommandDrawString(str, x1, x2));
      repaint();
   }
   
// Private methods -------------------------------

   private double adjustX(double x){
      return (x + getWidth() /2.0);

   }
   
   private double adjustY(double y){
      return (getHeight() / 2.0 - y);
   }
   
   private int round (double x) {
      if (x >= 0.0)
         return (int)(0.5 + x);
      else
         return -(int)(0.5 - x);
   }
}  
      

