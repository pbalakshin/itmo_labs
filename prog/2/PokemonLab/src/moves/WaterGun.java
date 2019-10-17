package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove
{
    public WaterGun() {
        super(Type.WATER, 40, 1.0);
    }

    @Override
    protected String describe() {
        return "shoots with a water gun";
    }
}
