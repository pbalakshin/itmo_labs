package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HammerArm extends PhysicalMove {
  public HammerArm() {
    super(Type.FIGHTING, 100, 0.9);
  }

  @Override
  protected void applySelfEffects(Pokemon self) {
    self.setMod(Stat.SPEED, -1);
  }

  @Override
  protected String describe() {
    return "applies a hammer hand";
  }
}
