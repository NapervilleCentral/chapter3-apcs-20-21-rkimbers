package TurtleGraphics;

import java.awt.Color;

public interface Pen {

   public void    down();
   public void    drawString (String text);
   public void    home();
   public void    move (double distance);
   public void    move (double x, double y);
   public void    setColor (Color color);
   public void    setDirection (double direction);
   public void    setWidth (int width);
   public String  toString();
   public void    turn (double degrees);
   public void    up();
   
}
