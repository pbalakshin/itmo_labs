package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
  public Facade() {
    super(Type.NORMAL, 70, 1.0);
  }

  @Override
  protected String describe() {
    return "facade";
  }

  @Override
  protected double calcBaseDamage(Pokemon att, Pokemon def) {
    double damage = super.calcBaseDamage(att, def);
    Status attStatus = att.getCondition();
    if (attStatus == Status.BURN || attStatus == Status.PARALYZE || attStatus == Status.POISON) {
      damage *= 2;
    }
    return damage;
  }
}
