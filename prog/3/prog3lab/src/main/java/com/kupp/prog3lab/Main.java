package com.kupp.prog3lab;

public class Main {
  public static void main(String[] args) {
    MoominTroll she = new MoominTroll("She");
    PieTray tray = new PieTray();
    Box box = new Box();
    she.think("Sister would be surprised");
    she.interact("ate most of the pies off", tray);
    she.interact("climbed into", box);
  }
}
