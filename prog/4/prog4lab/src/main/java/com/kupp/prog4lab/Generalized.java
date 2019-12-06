package com.kupp.prog4lab;

import com.kupp.prog3lab.Named;

public interface Generalized extends Named {
  default void act(String what) {
    System.out.printf("%s %s\n", Tools.toTitle(getName()), what);
  }
}
