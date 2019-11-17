package com.kupp.prog3lab;

public enum InteractionTypes {
  THINK("think"),
  ACT("act with");
  private String verb;
  InteractionTypes(String verb) {
    this.verb = verb;
  }

  public String getVerb() {
    return verb;
  }

}
