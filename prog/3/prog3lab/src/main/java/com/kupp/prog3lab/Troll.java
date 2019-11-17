package com.kupp.prog3lab;

public abstract class Troll extends NamedEntity {
  public Troll(String name) {
    super(name);
  }

  protected void interact(String action, Named named) {
    System.out.printf("%s %s %s\n", this.getName(), action, named.getName());
  }
}
