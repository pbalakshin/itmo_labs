package com.kupp.prog4lab.magical;

import com.kupp.prog3lab.MoominTroll;
import com.kupp.prog3lab.Named;
import com.kupp.prog3lab.TrollTypes;

abstract class Wizard extends MoominTroll {
  MagickWand wand = new MagickWand();

  Wizard(String name) {
    super(name, TrollTypes.WIZARD);
  }

  protected interface ISpell {
    void execute(Named target) throws MagicWandExeption;
  }

  protected class MagickWand {
    private ISpell spell = null;

    void setSpell(ISpell spell) {
      this.spell = spell;
    }

    public void castSpell(Named target) throws MagicWandExeption {
      class Target {
        private String name;
        private int resistance;

        public Target(Named target) {
          this.name = target.getName();
          this.resistance = 0;
          if (this.name.charAt(0) == 'a') {
            this.resistance = 1;
          } else if (this.name.charAt(0) == 'b') {
            this.resistance = 2;
          }
        }

        public int getResistance() {
          return resistance;
        }

        public String getName() {
          return name;
        }
      }
      if (this.spell != null) {
        Target t = new Target(target);
        if (t.resistance == 2) {
          return;
        }
        spell.execute(target);
      }
    }
  }
}
