package main.java.com.kupp.progLab2.pokemons;

import main.java.com.kupp.progLab2.moves.Facade;
import main.java.com.kupp.progLab2.moves.RockThrow;
import main.java.com.kupp.progLab2.moves.SweetScent;
import main.java.com.kupp.progLab2.moves.Withdraw;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shuckle extends Pokemon {
  public Shuckle(String name, int level) {
    super(name, level);

    setStats(20, 10, 230, 10, 230, 5);

    setType(Type.BUG, Type.ROCK);

    addMove(new SweetScent());
    addMove(new RockThrow());
    addMove(new Withdraw());
    addMove(new Facade());
  }
}
