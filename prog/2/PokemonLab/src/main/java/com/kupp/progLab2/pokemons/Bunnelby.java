package main.java.com.kupp.progLab2.pokemons;

import main.java.com.kupp.progLab2.moves.DoubleSlap;
import main.java.com.kupp.progLab2.moves.Facade;
import main.java.com.kupp.progLab2.moves.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bunnelby extends Pokemon {

  public Bunnelby(String name, int level) {
    super(name, level);

    setStats(38, 36, 38, 32, 36, 57);

    addType(Type.NORMAL);

    addMove(new Facade());
    addMove(new SludgeBomb());
    addMove(new DoubleSlap());
  }
}
