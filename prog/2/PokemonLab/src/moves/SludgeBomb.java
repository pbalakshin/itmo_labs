package moves;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    private final Effect poisonEff;

    public SludgeBomb() {
        super(Type.POISON, 90, 1.0);
        this.poisonEff = new Effect().chance(0.3).turns(-1).condition(Status.POISON);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(poisonEff);
    }

    @Override
    protected String describe() {
        return "throws a sludge bomb";
    }
}
