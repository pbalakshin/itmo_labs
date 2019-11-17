package com.kupp.prog3lab;

public class Main {
  public static void main(String[] args) {
    MoominTroll she = new MoominTroll("She");
    MoominTroll she1 = new MoominTroll("She");
    System.out.println(she.equals(she1));
    PieTray tray = new PieTray(8);
    Box box = new Box(BoxTypes.ROUND);
    she.think("Sister would be surprised");
    int pieCount = tray.getPieCount();
    if (pieCount > 2) {
      she.interact(String.format("ate %d pies off", pieCount - 2), tray);
      tray.setPieCount(2);
    }
    she.interact("climbed into", box);
    System.out.println(she.hashCode());
  }
}
