package com.kupp.prog3lab;

public class MoominTroll extends Troll implements ThinkingCreature {
  public MoominTroll(String name) {
    super(name);
  }

  public void think(String about) {
    System.out.printf("%s think that %s\n", this.getName(), about);
  }
}
