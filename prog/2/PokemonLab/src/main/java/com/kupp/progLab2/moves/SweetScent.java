package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove
{
    private static Effect decEv = new Effect().chance(1.0).turns(-1).stat(Stat.EVASION, -1);

    public SweetScent() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.addEffect(decEv);
    }

    @Override
    protected String describe() {
        return "use sweet scent";
    }
}
