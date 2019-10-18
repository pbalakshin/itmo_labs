package main.java.com.kupp.progLab2.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove
{
    private static Effect inc2Att = new Effect().chance(1.0).turns(-1).stat(Stat.ATTACK, 2);

    public Swagger() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.addEffect(inc2Att);
        Effect.confuse(opp);
    }

    @Override
    protected String describe() {
        return "swagger";
    }
}
