package pokemons;

import moves.BellyDrum;
import moves.Swagger;
import moves.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Marill extends Pokemon
{
    public Marill(String name, int level) {
        super(name, level);

        setStats(70,20, 50, 20,50,40);

        setType(Type.WATER, Type.FAIRY);

        addMove(new WaterGun());
        addMove(new Swagger());
        addMove(new BellyDrum());
    }
}
