package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import moves.RockThrow;
import moves.Facade;

public class Shuckle extends Pokemon {
    public Shuckle(java.lang.String name, int level) {
        super(name, level);
        setStats(20, 10, 230,10,230,5);
        addMove(new RockThrow());
        addMove(new Facade());
    }

}
