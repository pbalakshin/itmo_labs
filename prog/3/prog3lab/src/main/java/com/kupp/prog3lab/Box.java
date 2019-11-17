package com.kupp.prog3lab;

public class Box extends NamedEntity {
  private BoxTypes type;

  public Box(BoxTypes type) {
    super("box");
    this.type = type;
  }

  public BoxTypes getType() {
    return type;
  }

  @Override
  public String getName() {
    return String.format("%s %s", type.getString(), super.getName());
  }
}
