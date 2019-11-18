package com.kupp.prog3lab;

public enum BoxTypes {
  SQUARE("square", 0),
  ROUND("round", 1),
  TRIANGLE("triangle", 2),
  NONE("none", 3);

  private String str;
  private int val;

  BoxTypes(String str, int val) {
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
