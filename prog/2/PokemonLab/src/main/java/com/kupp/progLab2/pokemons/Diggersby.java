package main.java.com.kupp.progLab2.pokemons;

import main.java.com.kupp.progLab2.moves.HammerArm;
import ru.ifmo.se.pokemon.Type;

public class Diggersby extends Bunnelby {
  public Diggersby(String name, int level) {
    super(name, level);

    setStats(85, 56, 77, 50, 77, 78);

    addType(Type.GROUND);

    addMove(new HammerArm());
  }
}
