package com.kupp.prog4lab.magical;

import com.kupp.prog3lab.Named;
import com.kupp.prog3lab.ThinkingCreature;

import java.lang.reflect.Field;

public class Snusmumriken extends Wizard {
  public Snusmumriken() {
    super("Snusmumriken");
    this.wand.setSpell(new ISpell() {
      @Override
      public void execute(Named target) throws MagicWandExeption {
        if (target instanceof Wizard) {
          throw new MagicWandExeption("Snusmumriken cant use magick" +
                  " wand at other wizard");
        }
        try {
          Field targetName = target.getClass().getSuperclass().getSuperclass().getDeclaredField("name");
          targetName.setAccessible(true);
          targetName.set(target, "Pig");
          targetName.setAccessible(false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
          System.out.println(e);
        }
      }
    });
  }

  public void conjure(Named target) throws MagicWandExeption {
    this.wand.castSpell(target);
  }

  static class info {
    public String getInfo() {
      return "simple wizard";
    }
  }
}
