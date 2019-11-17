package com.kupp.prog3lab;

public class MoominTroll extends Troll implements ThinkingCreature {
  public MoominTroll(String name) {
    super(name);
  }

  protected void interact(String action, Named named) {
    System.out.printf("%s %s %s\n", this.getName(), action, named.getName());
  }

  public void think(String about) {
    System.out.printf("%s think that %s\n", this.getName(), about);
  }

  @Override
  public String toString() {
    return String.format("MoominTroll with name \"%s\"", this.getName());
  }
}
