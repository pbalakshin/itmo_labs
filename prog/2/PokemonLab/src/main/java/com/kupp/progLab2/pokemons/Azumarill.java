package main.java.com.kupp.progLab2.pokemons;

import main.java.com.kupp.progLab2.moves.WaterGun;

public class Azumarill extends Marill {
  public Azumarill(String name, int level) {
    super(name, level);

    setStats(100, 50, 80, 60, 80, 50);

    addMove(new WaterGun());
  }
}
