package TurtleGraphics;

import java.awt.Color;

public class Shapes {
   private Pen p;
   
   public Shapes(){
      this(200, 200);
   }
   
   public Shapes(int width, int height){
      SketchPad sp = new SketchPad();
      p = new StandardPen(sp);
      SketchPadWindow sw = new SketchPadWindow(width, height, sp);
   }
   
   public void setColor(Color color){
      p.setColor(color);
   }
   
   public void drawLine(double x1, double y1, double x2, double y2){
      p.up();
      p.move(x1, y1);
      p.down();
      p.move(x2, y2);
   }
   
   public void drawCircle(double x, double y, double r){
      double side = 2.0 * Math.PI * r / 120.0;
      p.up();
      p.move(x + r, y - side / 2.0); 
      p.setDirection(90); 
      p.down();
      for (int i = 0; i < 120; i++){
         p.move(side); 
         p.turn(3);
      }
   }
   
   public void drawRectangle(double x, double y, double w, double h){
      p.up();
      p.move(x, y);
      p.down();
      p.move(x + w, y);
      p.move(x + w, y + h);
      p.move(x, y + h);
      p.move(x, y);
   }
}
