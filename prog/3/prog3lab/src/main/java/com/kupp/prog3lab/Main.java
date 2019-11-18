package com.kupp.prog3lab;

public class Main {
  public static void main(String[] args) {
    MoominTroll she = new MoominTroll("She", TrollTypes.GOOD);
    PieTray tray = new PieTray(8);
    MomsBox box = new MomsBox(null);
    she.think("that's funny");
    she.think("Sister would be surprised");
    she.lookAround();
    she.see(tray, 0.9);
    she.see(box, 0.8);
    she.ponder(8);
    int pieCount = tray.getPieCount();
    if (pieCount > 2) {
      she.interact(String.format("ate %d pies off", pieCount - 2), tray);
      tray.setPieCount(2);
    }
    tray.howManyPies();
    she.interact("climbed into", box);
  }
}
