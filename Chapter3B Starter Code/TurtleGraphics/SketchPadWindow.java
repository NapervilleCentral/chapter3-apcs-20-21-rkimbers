package TurtleGraphics;

import BreezySwing.GBFrame;

public class SketchPadWindow extends GBFrame {

  protected SketchPad pad;

  public SketchPadWindow(SketchPad p) {
     this(150, 150, p);
  }

  public SketchPadWindow(int width, int height){
      pad = (SketchPad)addPanel(new SketchPad(), 1,1,1,1);
      setSize(width, height);
      setVisible(true);
   }

  public SketchPadWindow(int width, int height, SketchPad p){
      pad = (SketchPad)addPanel(p, 1,1,1,1);
      setSize(width, height);
      setVisible(true);
   }

}