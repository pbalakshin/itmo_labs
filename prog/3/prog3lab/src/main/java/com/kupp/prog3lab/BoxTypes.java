package com.kupp.prog3lab;

public enum BoxTypes {
  SQUARE("square"),
  ROUND("round"),
  TRIANGLE("triangle");

  private String str;

  BoxTypes(String str) {
    this.str = str;
  }

  public String getString() {
    return this.str;
  }
}
