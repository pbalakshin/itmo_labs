package com.kupp.prog3lab;

public abstract class NamedEntity implements Named {
  private String name;

  public NamedEntity(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
