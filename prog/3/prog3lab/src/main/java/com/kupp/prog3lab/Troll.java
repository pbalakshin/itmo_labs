package com.kupp.prog3lab;

public abstract class Troll extends NamedEntity {
  public Troll(String name) {
    super(name);
  }

  protected abstract void interact(String action, Named named);
}
