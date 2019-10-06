package moves;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {
    private Effect decEv;

    public SweetScent() {
        super(Type.NORMAL, 0.0, 1.0);
        Effect decEv = new Effect().chance(1.0).turns(-1).stat(Stat.EVASION, -1);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.setCondition(decEv);
    }
}
