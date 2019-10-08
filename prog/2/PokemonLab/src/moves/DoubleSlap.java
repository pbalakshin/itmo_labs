package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleSlap extends PhysicalMove {
    public DoubleSlap() {
        super(Type.NORMAL, 15, 0.85);
    }

    @Override
    protected String describe() {
        return "slap";
    }
}
