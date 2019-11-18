package com.kupp.prog3lab;

import java.util.function.BinaryOperator;

public abstract class Troll extends NamedEntity {
  private TrollTypes type;

  public Troll(String name, TrollTypes type) {
    super(name);
    BinaryOperator<TrollTypes> nullCheck = (x, y) -> x == null ? y : x;
    this.type = nullCheck.apply(type, TrollTypes.NONE);
  }

  public TrollTypes getType() {
    return type;
  }

  public abstract void interact(String action, Named named);
}
