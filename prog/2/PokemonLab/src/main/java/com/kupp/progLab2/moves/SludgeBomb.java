package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
  private static Effect poisonEff = new Effect().chance(0.3).turns(-1).condition(Status.POISON);

  public SludgeBomb() {
    super(Type.POISON, 90, 1.0);
  }

  @Override
  protected void applyOppEffects(Pokemon opp) {
    opp.addEffect(poisonEff);
  }

  @Override
  protected String describe() {
    return "throws a sludge bomb";
  }
}
