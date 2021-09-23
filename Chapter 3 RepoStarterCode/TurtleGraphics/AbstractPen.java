package TurtleGraphics;

import java.awt.*;

abstract public class AbstractPen implements Pen {

   // Instance variables ------------------------
   
   protected double xPos, yPos,direction;
   protected int width;
   protected boolean isDown;
   protected Color color;    
   protected SketchPad pad;


   // Public methods ----------------------------
   
   public void down(){
      isDown = true;
   }
   
   abstract public void drawString (String text);
   
   public void home () {
      xPos = 0;
      yPos = 0;
      direction = 90.0;
   }

   public void move (double distance) {
      drawLine (xDestination (distance), yDestination (distance));
   }
   
   public void move (double x, double y){
      turn(x, y);
      drawLine (x, y);
   }

   public boolean isDown(){
      return isDown;
   }

   public void setColor (Color c) {
      color = c;
   }
   
   public void setDirection(double d){
      direction = d % 360.0;
   }   

   public void setWidth(int w){
      if (w < 1)
         throw new RuntimeException 
                   ("Width " + w + " is invalid -- must be >= 1");
      width = w;
   }   

   public String toString () {
      return
            "Position: "  + xPos + ", " + yPos + " " +
            "\nColor: "     + color + " "  +
            "\nWidth: "     + width + " " +
            "\nIs down: "   + isDown + " "  +
            "\nDirection: " + direction;
   }
            
   public void turn (double degrees) {
      direction = (direction + degrees) % 360.0;
   }
   
   public void up () {
      isDown = false;
   }
   
   // Private and protected methods -------------------------

   abstract protected void drawLine (double x, double y);
   
   protected void initialize (SketchPad p){
      pad = p;
      isDown = true;
      color = Color.blue;
      width = 2;
      home();
   }

   protected void turn (double x, double y){
      if (xPos == x && yPos == y)
         return;
      double deltaX = x - xPos;
      double deltaY = y - yPos;
      double distance = Math.sqrt (deltaX * deltaX + deltaY * deltaY);
      direction = Math.toDegrees (Math.asin(Math.abs(deltaY) / distance));
      if (deltaY < 0)
         direction = - direction;
      if (deltaX < 0)
         direction = 180.0 - direction;
   } 
   
   private double xDestination (double distance){
      return xPos + distance * Math.cos(Math.toRadians (direction));
   }
   
   private double yDestination (double distance){
      return yPos + distance * Math.sin(Math.toRadians (direction));
   }
}
