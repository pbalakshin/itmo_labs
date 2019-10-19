package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.*;

public class HammerArm extends PhysicalMove {
  private static Effect decSp = new Effect().chance(1.0).turns(-1).stat(Stat.SPEED, -1);

  public HammerArm() {
    super(Type.FIGHTING, 100, 0.9);
  }

  @Override
  protected void applySelfEffects(Pokemon self) {
    self.addEffect(decSp);
  }

  @Override
  protected String describe() {
    return "applies a hammer hand";
  }
}
