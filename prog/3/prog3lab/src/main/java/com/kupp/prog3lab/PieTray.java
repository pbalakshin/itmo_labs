package com.kupp.prog3lab;

public class PieTray extends NamedEntity {
  private int pieCount;
  public PieTray(int pieCount) {
    super("pie tray");
    setPieCount(pieCount);
  }

  public void howManyPies() {
    System.out.printf("%d pies on tray now.\n", getPieCount());
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
