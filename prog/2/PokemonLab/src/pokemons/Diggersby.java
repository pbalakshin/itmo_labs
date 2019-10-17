package pokemons;

import moves.DoubleSlap;
import moves.Facade;
import moves.HammerArm;
import moves.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Diggersby extends Pokemon
{
    public Diggersby(String name, int level) {
        super(name, level);

        setStats(85, 56, 77,50,77,78);

        setType(Type.NORMAL, Type.GROUND);

        addMove(new Facade());
        addMove(new SludgeBomb());
        addMove(new DoubleSlap());
        addMove(new HammerArm());
    }
}
