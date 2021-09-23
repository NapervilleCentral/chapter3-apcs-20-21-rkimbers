import TurtleGraphics.*;
import BreezySwing.*;
import java.awt.Color;

public class TestMultiplePads extends GBFrame{

   private SketchPad pad1;
   private SketchPad pad2;
   private SketchPad pad3;
   private SketchPad pad4;

   public StandardPen pen1;
   public StandardPen pen2;
   public StandardPen pen3;
   public StandardPen pen4;

   public TestMultiplePads(){
      pad1 = (SketchPad)addPanel(new SketchPad(),1,1,1,1);
      pad2 = (SketchPad)addPanel(new SketchPad(),1,2,1,1);
      pad3 = (SketchPad)addPanel(new SketchPad(),2,1,1,1);
      pad4 = (SketchPad)addPanel(new SketchPad(),2,2,1,1);

      pad1.setBackground(Color.red);
      pad2.setBackground(Color.white);
      pad3.setBackground(Color.green);
      pad4.setBackground(Color.yellow);

      pen1 = new StandardPen(pad1);
      pen2 = new StandardPen(pad2);
      pen3 = new StandardPen(pad3);
      pen4 = new StandardPen(pad4);
   }

   public static void main (String[] args){
      TestMultiplePads tpo = new TestMultiplePads();
      tpo.setSize(200, 200);
      tpo.setVisible(true);
      tpo.pen1.move(50);
      tpo.pen2.move(50);
      tpo.pen3.move(50);
      tpo.pen4.move(50);

  }
}
