package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class BellyDrum extends SpecialMove {
    public BellyDrum() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        double HP = self.getHP();
        self.setMod(Stat.HP, (int)(HP / 2 + 0.5));
        self.setMod(Stat.ATTACK, 6);
    }

    @Override
    protected String describe() {
        return "use belly drum";
    }
}
