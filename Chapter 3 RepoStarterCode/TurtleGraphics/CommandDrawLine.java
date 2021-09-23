package TurtleGraphics;

import java.awt.geom.*;
import java.awt.*;

public class CommandDrawLine extends Command {

   private double x1, x2, x3, x4;

   public CommandDrawLine(double y1, double y2, double y3, double y4){
      this.x1 = y1;
      this.x2 = y2;
      this.x3 = y3;
      this.x4 = y4;
   }
   
   public void doCommand(Graphics2D g, int width, int height){
      g.draw (new Line2D.Double(adjustX(x1, width), adjustY(x2, height), 
                                adjustX(x3, width), adjustY(x4, height)));

   }
}
