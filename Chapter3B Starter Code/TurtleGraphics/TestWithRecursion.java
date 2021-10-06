import TurtleGraphics.*;

public class TestWithRecursion {
   public static void main (String [] args) {
      Pen pen = new StandardPen();
      pen.setWidth(1);
      for (int i = 1; i <= 6; i++){
         pen.up();
         pen.move(-100, 245 - 70 * i);
         pen.down();
         pen.setDirection(0);
         drawFractal(i, pen, 200);
      }
   }
   
   private static void drawFractal(int depth, Pen pen, double length){
      if (depth <= 1)
         pen.move(length);
      else{
         drawFractal(depth - 1, pen, length / 3);
         pen.turn(60);
         drawFractal(depth - 1, pen, length / 3);
         pen.turn(-120);
         drawFractal(depth - 1, pen, length / 3);
         pen.turn(60);
         drawFractal(depth - 1, pen, length / 3);
      }
   } 
}


