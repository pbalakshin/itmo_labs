package com.kupp.prog3lab;

public abstract class Troll extends NamedEntity {
  private TrollTypes type;

  public Troll(String name, TrollTypes type) {
    super(name);
    this.type = type;
  }

  public TrollTypes getType() {
    return type;
  }

  protected abstract void interact(String action, Named named);
}
