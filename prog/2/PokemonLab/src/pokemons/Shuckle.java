package pokemons;

import moves.SweetScent;
import moves.Withdraw;
import ru.ifmo.se.pokemon.Pokemon;
import moves.RockThrow;
import moves.Facade;
import ru.ifmo.se.pokemon.Type;

public class Shuckle extends Pokemon {
    public Shuckle(java.lang.String name, int level) {
        super(name, level);
        setStats(20, 10, 230,10,230,5);
        addMove(new SweetScent());
        addMove(new RockThrow());
        addMove(new Withdraw());
        addMove(new Facade());
        setType(Type.BUG, Type.ROCK);
    }

}
