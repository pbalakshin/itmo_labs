package main.java.com.kupp.progLab2;

import main.java.com.kupp.progLab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Lab2Battleground
{
    public static void main(String[] args) {
        Battle battleground = new Battle();

        Pokemon ally1 = new Shuckle("Крутько", 42);
        Pokemon ally2 = new Diggersby("Здравый смысл", 60);
        Pokemon ally3 = new Marill("Кожанка", 87);
        Pokemon foe1 = new Bunnelby("Поляков", 47);
        Pokemon foe2 = new Azurill("Методичка", 87);
        Pokemon foe3 = new Azumarill("ПСЖ", 21);

        battleground.addAlly(ally1);
        battleground.addAlly(ally2);
        battleground.addAlly(ally3);

        battleground.addFoe(foe1);
        battleground.addFoe(foe2);
        battleground.addFoe(foe3);

        battleground.go();
    }
}
