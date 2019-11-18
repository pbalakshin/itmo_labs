package com.kupp.prog3lab;

import java.util.function.BinaryOperator;

public class MomsBox extends NamedEntity {
  private BoxTypes type;

  public MomsBox(BoxTypes type) {
    super("moomin-mom box");
    BinaryOperator<BoxTypes> nullCheck = (x, y) -> x == null ? y : x;
    this.type = nullCheck.apply(type, BoxTypes.NONE);
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
    if (!(o instanceof MomsBox)) {
      return false;
    }
    MomsBox other = (MomsBox) o;
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

