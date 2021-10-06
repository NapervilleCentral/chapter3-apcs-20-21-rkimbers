package TurtleGraphics;

import java.awt.*;
import java.util.*;

public class RainbowPen extends StandardPen {

   Random random = new Random();;
   
   public RainbowPen(){
      super();
   }

   public RainbowPen(SketchPad pad){
     super(pad);
   }

   public RainbowPen(SketchPadWindow win){
      super(win);
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
