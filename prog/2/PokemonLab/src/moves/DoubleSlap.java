package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DoubleSlap extends PhysicalMove {
    public DoubleSlap() {
        super(Type.NORMAL, 15, 0.85);
    }

    @Override
    protected String describe() {
        return "slap";
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        double hit = super.calcCriticalHit(pokemon, pokemon1);
        double chance = Math.random();
        double k = 1.0;
        if (chance < 0.1665) {
            k = 2.0;
        } else if (chance < 0.333) {
            k = 3.0;
        } else if (chance < 0.416) {
            k = 4.0;
        } else if (chance < 0.499) {
            k = 5.0;
        }
        return hit * k;
    }


}
