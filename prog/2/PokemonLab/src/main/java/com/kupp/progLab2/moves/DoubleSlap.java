package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DoubleSlap extends PhysicalMove {

  public DoubleSlap() {
    super(Type.NORMAL, 15, 0.85);
  }

  @Override
  protected String describe() {
    return "slap";
  }

  @Override
  protected double calcCriticalHit(Pokemon att, Pokemon def) {
    double TWO_HIT_RIGHT_EDGE = 0.375;
    double THREE_HIT_RIGHT_EDGE = 0.75;
    double FOUR_HIT_RIGHT_EDGE = 0.875;
    double FIVE_HIT_RIGHT_EDGE = 1.0;

    double chance = Math.random();
    int hits_count = 0;
    if (chance <= TWO_HIT_RIGHT_EDGE) {
      hits_count = 2;
    } else if (chance <= THREE_HIT_RIGHT_EDGE) {
      hits_count = 3;
    } else if (chance <= FOUR_HIT_RIGHT_EDGE) {
      hits_count = 4;
    } else if (chance <= FIVE_HIT_RIGHT_EDGE) {
      hits_count = 5;
    }

    double k = 0.0;
    for (int i = 0; i < hits_count; i++) {
      k += super.calcCriticalHit(att, def);
    }

    return k;
  }
}
