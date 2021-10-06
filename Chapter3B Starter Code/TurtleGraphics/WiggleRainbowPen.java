package TurtleGraphics;

import java.awt.*;
import java.util.*;

public class WiggleRainbowPen extends WigglePen {

   private Random random = new Random();
   
   public WiggleRainbowPen(){
      super();
   }

   public WiggleRainbowPen(SketchPadWindow win){
      super(win);
   }

   public WiggleRainbowPen(SketchPad pad, int wiggles, double wiggleAngle){
     super(pad, wiggles, wiggleAngle);
  }

   public void drawString (String str){
      setColor(new Color (random.nextInt (256), 
                          random.nextInt (256), 
                          random.nextInt (256)));
      super.drawString(str);
   }
      


   public void move(double distance){
      setColor(new Color (random.nextInt (256), 
                          random.nextInt (256), 
                          random.nextInt (256)));
      super.move(distance);
   }
   
   public void move(double x, double y){
      setColor(new Color (random.nextInt (256), 
                          random.nextInt (256), 
                          random.nextInt (256)));
      super.move(x, y);
   }
}   
