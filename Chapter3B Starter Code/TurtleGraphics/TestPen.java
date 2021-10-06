import TurtleGraphics.*;
import TerminalIO.KeyboardReader;
import java.util.Random;
import java.awt.Color;      

public class TestPen {

   public static void main (String[] args){


      KeyboardReader reader = new KeyboardReader();
      while (true){
         int test = reader.readInt ("Select test (1-10): ");
         if      (test == 1) 
            test1();  
         else if (test == 2) 
            test2();
         else if (test == 3) 
            test3();
         else if (test == 4) 
            test4();
         else if (test == 5) 
            test5();
         else if (test == 6)
            test6();
         else if (test == 7)
            test7();
         else if (test == 8)
            test8();
         else if (test == 9)
            test9();
         else if (test == 10)
            test10();
         else if (test == 11)
            test11();

         else
            System.out.println ("No such test");
      }
      
   }
   
   public static void test1(){
      Pen p = new StandardPen();
      p.setWidth(3);
      baseTest(p);
   }

   public static void test2(){
      Pen p = new WiggleRainbowPen();
      baseTest(p);
   }

   public static void test3(){
      SketchPad pad = new SketchPad();
      Pen p1 = new StandardPen(pad);
      Pen p2 = new StandardPen(pad);
      SketchPadWindow win = new SketchPadWindow(300, 300, pad);
      
      int i;
      
      p1.setColor(Color.blue); p2.setColor(Color.red);
      for (i = 1; i < 10; i++){
         p1.turn(36); p1.move(20); 
         p2.turn(-36); p2.move(20);
      }
   }

   public static void test4(){
      SketchPad pad = new SketchPad();
      SketchPadWindow win = new SketchPadWindow(300, 300, pad);
      Pen p;
      p = new StandardPen(pad); 
      p.move(75);
      p = new WigglePen(pad, 1, 40);
      p.setColor(Color.blue); p.move(75); 
      p = new WigglePen(pad, 2, 40);
      p.setColor(Color.red); p.move(0, 75); 
      
      for (int i = 1; i <= 5; i++){
         p = new WigglePen(pad, i, 40);
           p.setColor(Color.blue);
         p.up(); p.move(-90, -i * 10); 
         p.down(); p.move(90, -i * 10); 
      }     
                                           

      p = new WigglePen(pad, 5, 40);
      p.up(); p.move(50, -100); p.setDirection(0); p.down();
      for (int i = 1; i <= 4; i++){
         p.move(150); p.turn(-90);
      }
      
      p = new StandardPen(pad);
      p.setColor(Color.blue); p.setWidth(1);
      p.up()  ; p.move(-90, - 100); 
      p.down(); p.move(10, - 100); 
      for (int i = 1; i <= 5; i++){
         p = new WigglePen(pad, 1, 40);
         p.setColor(Color.blue); p.setWidth(1);
         p.up()  ; p.move(-90, - 100); 
         p.down(); p.move(-90 + i * 20, - 100); 
      }
   }
   
   public static void test5(){
      Pen p = new WigglePen();
      baseTest(p);
   }
   
   public static void test6(){
      Pen p = new RainbowPen();
      baseTest(p);
   }
   
   public static void test7(){
      Pen p = new StandardPen();
      double radius = 50.0;
      double side = 2.0 * Math.PI * radius / 120.0;
      p.up();p.move(50, - side / 2.0); p.setDirection(90); p.down();
      for (int i = 0; i < 120; i++){
         p.move(side); p.turn(3);
      }
   }

   public static void test8(){
      Pen p = new BackwardPen();
      baseTest(p);
   }

   public static void test9(){
      Shapes s = new Shapes();
      s.setColor(Color.blue);
      s.drawLine(-50, 0, 50, 0);
      s.setColor(Color.red);
      s.drawLine(0, -50, 0, 50);
      
      s.setColor(Color.magenta);
      s.drawCircle(30, 30, 30);
      
      s.setColor(Color.yellow);
      s.drawRectangle(-10, -10, -50, - 30);
   }
   
   public static void test10(){
      SketchPadWindow win = new SketchPadWindow(400, 400);
      Pen pen = new StandardPen(win);
      pen.up();
      pen.move(100);
      pen.down();
      for (int count = 1; count <= 200/5; count++){
         pen.setColor(Color.red);
         for (int i = 1; i <= 4; i++){
            pen.move(25);
            pen.turn(90);
         }
         pen.setColor(Color.blue);
         for (int i = 1; i <= 4; i++){
            pen.move(25);
            pen.turn(90);
         }
         pen.up();
         pen.move(-5);
         pen.down();
      }
   }

    public static void test11(){
       Random generator = new Random();
       StandardPen pen = new StandardPen();
       pen.setWidth(1);
       int i, turnAmount;

       for (i = 1; i <= 100; i++){
          turnAmount = generator.nextInt(360);
          pen.turn (turnAmount);
          pen.move (5);
       }
    }

   public static void baseTest(Pen p){
      // Display the turtle's state
      System.out.println (p);
           
      // Draw red string at 40, 40 
      p.up(); p.setColor(Color.red); p.move(40,40); p.drawString("xxx");
      
      //home and draw a blue string at home position
      p.home(); 
      p.drawString ("Hello world!");
      
      // Draw a cross at midscreen (blue up, left yellow, red down, right green)
      p.down();
      p.home(); p.setColor(Color.blue)  ; p.move(50)   ;
      p.home(); p.setColor(Color.yellow); p.turn(90)         ; p.move(50);
      p.home(); p.setColor(Color.red)   ; p.setDirection(270); p.move(50);
      p.home(); p.setColor(Color.green) ; p.setDirection(0)  ; p.move(50);

      // Draw clockwise dark gray 10 sided regular polygon in 
      // the third quadrant, width 1
      p.home(); p.turn (90); p.setColor (Color.darkGray); p.down(); p.setWidth(1);
      for (int i = 0; i < 10; i++){
         p.move (15);
         p.turn (-36);
      }
      
      // Draw clockwise red 10 sided polygon, width 2 on top of it
      p.home(); p.turn (90); p.setColor (Color.red); p.down(); p.setWidth(2);
      for (int i = 0; i < 10; i++){
         p.move (20);
         p.turn (-36);
      }
      
      // Draw a square at -10, -10 using setDirection and move(distance)
      p.up(); p.move(-10, -10); p.down();
      for (int i = 2; i <= 5; i++){
         p.setDirection(i * 90);
         p.move(50);
      }
      
      // Draw a smaller square inside at -15, -15 using move(x, y)
      p.setColor(Color.blue); p.up(); p.move(-15, -15); p.down();
      p.move(-45, -15); p.move(-45, -45); p.turn(90); p.move(30); p.move(-15, -15);
      
      // Test setDirection
      p.down(); 
      p.home(); p.setColor(Color.magenta); p.setDirection(-45); p.move(50); 
      p.home(); p.setColor(Color.green)  ; p.setDirection(225) ; p.move(50);
   }
   
   
}
