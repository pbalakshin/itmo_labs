import pokemons.Shuckle;
import ru.ifmo.se.pokemon.*;

public class PokemonLab {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Shuckle("Крутько", 3);
        Pokemon p2 = new Pokemon("Поляков", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
