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

  public abstract void interact(String action, Named named);
  public abstract void lookAround();
  public abstract void see(Named named);
  public abstract void ponder();
}
