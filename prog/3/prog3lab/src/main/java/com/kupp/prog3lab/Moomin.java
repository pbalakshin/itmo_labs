package com.kupp.prog3lab;

public class Moomin {
  private String name;
  private MoominGender gender;

  public Moomin(String name, MoominGender gender) {
    this.name = name;
    this.gender = gender;
  }

  public String getName() {
    return this.name;
  }

  public MoominGender getGender() {
    return this.gender;
  }
}
