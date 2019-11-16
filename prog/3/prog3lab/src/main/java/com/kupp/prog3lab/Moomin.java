package com.kupp.prog3lab;

public interface Moomin {
  String getName();
  Gender getGender();
  int getAge();
  void interactWithThing(Thing thing);
  void say(String text);
  void think(String text);
}
