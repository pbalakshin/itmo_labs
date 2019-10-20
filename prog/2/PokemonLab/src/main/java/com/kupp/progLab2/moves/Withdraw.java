package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Withdraw extends StatusMove {

  public Withdraw() {
    super(Type.WATER, 0.0, 1.0);
  }

  @Override
  protected void applySelfEffects(Pokemon self) {
    self.setMod(Stat.DEFENSE, 1);
  }

  @Override
  protected String describe() {
    return "withdraw";
  }
}
