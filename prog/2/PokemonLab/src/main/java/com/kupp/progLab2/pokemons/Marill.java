package main.java.com.kupp.progLab2.pokemons;

import main.java.com.kupp.progLab2.moves.BellyDrum;
import ru.ifmo.se.pokemon.Type;

public class Marill extends Azurill
{
    public Marill(String name, int level) {
        super(name, level);

        setStats(70,20, 50, 20,50,40);

        setType(Type.WATER, Type.FAIRY);

        addMove(new BellyDrum());
    }
}
