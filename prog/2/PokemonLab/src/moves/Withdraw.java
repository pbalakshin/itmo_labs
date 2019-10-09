package moves;

import ru.ifmo.se.pokemon.*;

public class Withdraw extends StatusMove {
    private final Effect incDef;

    public Withdraw() {
        super(Type.WATER, 0.0, 1.0);
        this.incDef = new Effect().chance(1.0).turns(-1).stat(Stat.DEFENSE, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.addEffect(this.incDef);
    }
}
