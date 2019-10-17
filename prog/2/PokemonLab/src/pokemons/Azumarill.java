package pokemons;

import moves.BellyDrum;
import moves.Facade;
import moves.Swagger;
import moves.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azumarill extends Pokemon
{
    public Azumarill(String name, int level) {
        super(name, level);

        setStats(100,50,80,60,80,50);

        setType(Type.WATER, Type.FAIRY);

        addMove(new WaterGun());
        addMove(new Swagger());
        addMove(new BellyDrum());
        addMove(new WaterGun());
    }
}
