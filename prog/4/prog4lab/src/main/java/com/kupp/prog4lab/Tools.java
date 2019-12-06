package com.kupp.prog4lab;

public class Tools {
  public static String toTitle(String word) {
    if (word == null || word.isEmpty()) {
      return "";
    }
    return word.substring(0, 1).toUpperCase() + word.substring(1);
  }
}
