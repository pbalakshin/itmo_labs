package main.java.com.kupp.progLab2;

import main.java.com.kupp.progLab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Lab2Battleground {
  public static void main(String[] args) {
    Battle battleground = new Battle();

    battleground.addAlly(new Shuckle("Nohtyp", 42));
    battleground.addAlly(new Diggersby("Eht", 60));
    battleground.addAlly(new Marill("Tseb", 87));

    battleground.addFoe(new Bunnelby("Avaj", 47));
    battleground.addFoe(new Azurill("Kcus", 87));
    battleground.addFoe(new Azumarill("Peed", 21));

    battleground.go();
  }
}
