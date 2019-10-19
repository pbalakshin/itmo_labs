package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BellyDrum extends StatusMove {
  public BellyDrum() {
    super(Type.NORMAL, 0.0, 1.0);
  }

  @Override
  protected void applySelfEffects(Pokemon self) {
    double HP = self.getHP();
    self.setMod(Stat.HP, (int) Math.round(HP / 2));
    self.setMod(Stat.ATTACK, 6);
  }

  @Override
  protected String describe() {
    return "use belly drum";
  }
}
