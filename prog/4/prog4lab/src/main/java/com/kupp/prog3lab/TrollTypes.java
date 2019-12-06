package com.kupp.prog3lab;

public enum TrollTypes {
  EVILDOER("evildoer", 0),
  GOOD("good", 1),
  NERVOUS("nervous", 2),
  WIZARD("wizard", 3),
  NONE("none", 3);

  private String str;
  private int val;
  TrollTypes(String str, int val) {
    this.str = str;
    this.val = val;
  }

  @Override
  public String toString() {
    return this.str;
  }

  public int getValue() {
    return this.val;
  }
}
