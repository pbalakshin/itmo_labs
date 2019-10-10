import pokemons.Azurill;
import pokemons.Bunnelby;
import pokemons.Diggersby;
import pokemons.Shuckle;
import ru.ifmo.se.pokemon.*;

public class PokemonLab {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon ally1 = new Shuckle("Крутько", 42);
        Pokemon ally2 = new Diggersby("Здравый смысл", 53);
        Pokemon foe1 = new Bunnelby("Поляков", 47);
        Pokemon foe2 = new Azurill("Неклассика", 87);
        b.addAlly(ally1);
        b.addAlly(ally2);
        b.addFoe(foe1);
        b.addFoe(foe2);
        b.go();
    }
}
