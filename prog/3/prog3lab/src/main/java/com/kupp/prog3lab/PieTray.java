package com.kupp.prog3lab;

public class PieTray extends NamedEntity {
  private int pieCount;
  public PieTray(int pieCount) {
    super("pie tray");
    this.pieCount = pieCount;
  }

  public int getPieCount() {
    return pieCount;
  }

  public void setPieCount(int pieCount) {
    if (pieCount >= 0) {
      this.pieCount = pieCount;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof PieTray)) {
      return false;
    }
    PieTray other = (PieTray)o;
    return other.getPieCount() == this.getPieCount();
  }

  @Override
  public String toString() {
    return String.format("PieTray with %d pies", this.getPieCount());
  }

  @Override
  public int hashCode() {
    return this.getPieCount();
  }
}
