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
    return String.format("%s %s", type.toString(), super.getName());
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Box)) {
      return false;
    }
    Box other = (Box) o;
    return other.getName().equals(this.getName());
  }

  @Override
  public String toString() {
    return this.getName();
  }

  @Override
  public int hashCode() {
    return this.getName().hashCode();
  }
}
