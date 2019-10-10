package pokemons;

import moves.Swagger;
import moves.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azurill extends Pokemon {
    public Azurill(String name, int level) {
        super(name, level);

        setStats(50,20,40,20,40,20);

        setType(Type.NORMAL, Type.FAIRY);

        addMove(new WaterGun());
        addMove(new Swagger());
    }
}
