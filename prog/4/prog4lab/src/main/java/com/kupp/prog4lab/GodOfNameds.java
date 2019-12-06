package com.kupp.prog4lab;

import com.kupp.prog3lab.Named;

public interface GodOfNameds {
  void ponder();
  void stateFact(String s, Named... nameds) throws StateFactException;
  void say(String what);
}
