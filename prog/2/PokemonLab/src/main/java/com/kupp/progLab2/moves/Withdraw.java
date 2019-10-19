package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.*;

public class Withdraw extends StatusMove {
  private static Effect incDef;

  public Withdraw() {
    super(Type.WATER, 0.0, 1.0);
    incDef = new Effect().chance(1.0).turns(-1).stat(Stat.DEFENSE, 1);
  }

  @Override
  protected void applySelfEffects(Pokemon self) {
    self.addEffect(incDef);
  }

  @Override
  protected String describe() {
    return "withdraw";
  }
}
