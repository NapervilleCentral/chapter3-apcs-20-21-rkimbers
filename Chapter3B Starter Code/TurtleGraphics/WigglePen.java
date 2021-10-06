package TurtleGraphics;

import java.awt.*;
import java.util.*;

public class WigglePen extends StandardPen {

   private int numWiggles = 5;
   private double wiggleAngle = 30;
   
   public WigglePen(){
      super();
   }

   public WigglePen(SketchPadWindow win){
      super(win);
   }

   public WigglePen(SketchPad pad, int w, double wa){
     super(pad);
     numWiggles = w;
     wiggleAngle = wa;
   }

   public void move(double distance){
      int i;
      double sizeOfMove;
      double halfAngle = wiggleAngle / 2.0;
      sizeOfMove = distance / 
                   (numWiggles * 2.0 * Math.cos (Math.PI * halfAngle / 180.0));
      turn(halfAngle);
      for (i = 1; i <= numWiggles; i++){
         turn(-wiggleAngle); super.move(sizeOfMove);
         turn(+wiggleAngle); super.move(sizeOfMove);
      }
      turn(-halfAngle);
   }
   
   public void move(double x, double y){
      double deltaX = x - xPos;
      double deltaY = y - yPos;
      double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY); 
      turn (x, y);
      move(distance);
   }
}   
