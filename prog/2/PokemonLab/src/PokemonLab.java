import pokemons.Bunnelby;
import pokemons.Shuckle;
import ru.ifmo.se.pokemon.*;

public class PokemonLab {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Shuckle("Крутько", 42);
        Pokemon p2 = new Bunnelby("Поляков", 47);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
