package TurtleGraphics;

import java.awt.*;

public class CommandSetColor extends Command {

   private Color color;

   public CommandSetColor(Color c){
      color = c;
   }
   
   public void doCommand(Graphics2D g, int width, int height){
      g.setColor(color);
   }
}
