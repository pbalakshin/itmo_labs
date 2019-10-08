package pokemons;

import moves.DoubleSlap;
import moves.Facade;
import moves.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bunnelby extends Pokemon {

    public Bunnelby(java.lang.String name, int level) {
        super(name, level);
        setStats(38,36,38,32,36,57);
        addMove(new Facade());
        addMove(new SludgeBomb());
        addMove(new DoubleSlap());
        addType(Type.NORMAL);
    }
}
