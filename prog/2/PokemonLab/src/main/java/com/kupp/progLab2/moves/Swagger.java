package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

  public Swagger() {
    super(Type.NORMAL, 0.0, 1.0);
  }

  @Override
  protected void applyOppEffects(Pokemon opp) {
    opp.setMod(Stat.ATTACK, 2);
    Effect.confuse(opp);
  }

  @Override
  protected String describe() {
    return "swagger";
  }
}
