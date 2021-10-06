package TurtleGraphics;

import java.awt.*;

public class CommandSetPenWidth extends Command {

   private int penWidth;

   public CommandSetPenWidth(int w){
      penWidth = w;
   }
   
   public void doCommand(Graphics2D g, int width, int height){
      g.setStroke(new BasicStroke(penWidth));
   }    
}
