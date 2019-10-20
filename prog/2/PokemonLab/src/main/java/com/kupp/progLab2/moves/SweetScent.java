package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SweetScent extends StatusMove {

  public SweetScent() {
    super(Type.NORMAL, 0.0, 1.0);
  }

  @Override
  protected void applyOppEffects(Pokemon opp) {
    opp.setMod(Stat.EVASION, -1);
  }

  @Override
  protected String describe() {
    return "use sweet scent";
  }
}
