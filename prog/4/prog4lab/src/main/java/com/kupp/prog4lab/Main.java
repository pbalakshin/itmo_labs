package com.kupp.prog4lab;

import com.kupp.prog3lab.*;
import com.kupp.prog4lab.magical.MagicWandExeption;
import com.kupp.prog4lab.magical.Snusmumriken;


import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {

    GodOfNameds joePesci = new GodOfNameds() {

      @Override
      public void ponder() {

      }

      public void stateFact(String fact, Named... nameds) {
        for (Named named : nameds) {
          fact = fact.replaceFirst("(?<!\\\\)%", named.getName());
        }
        if (Pattern.compile("(?<!\\\\)%").matcher(fact).find()) {
          throw new StateFactException("Lack of named objects!");
        }
        System.out.println(fact);
      }

      @Override
      public void say(String what) {
        System.out.println(what);
      }
    };
    MoominTroll homsa = new MoominTroll("Homsa", TrollTypes.GOOD);
    homsa.interact("dodged an", () -> "avalanche of dinner plates");
    Generalized paintings = () -> "paintings";
    paintings.act("fell apart and buried underneath the hall");
    MoominTroll littleMyu = new MoominTroll("Little Myu", TrollTypes.GOOD);
    joePesci.stateFact("But % couldn't answer even if" +
            " she wanted to, because she rolled through the hatch" +
            " straight into the black water.", littleMyu);
    joePesci.stateFact("Suddenly heard a disgusting, deafening sound.\n" +
                    "It was % laughing at how the % had been avenged.\n" +
                    "If % was a little bit bigger, she would have drowned.",
            () -> "Emma", () -> "park guard", littleMyu);
    joePesci.stateFact("% easy, like a bubble, come up to the surface" +
            " from whirlpool, snorting and spitting.", littleMyu);
    joePesci.stateFact("% swam like a cork, and the stream" +
            " quickly carried her farther and farther.", littleMyu);

    PieTray tray = new PieTray(8);
    MomsBox box = new MomsBox(BoxTypes.ROUND);
    littleMyu.think("that's funny");
    littleMyu.think("Sister would be surprised");
    littleMyu.lookAround();
    littleMyu.see(tray, 0.9);
    littleMyu.see(box, 0.8);
    littleMyu.ponder(8);
    int pieCount = tray.getPieCount();
    if (pieCount > 2) {
      littleMyu.interact(String.format("ate %d pies off", pieCount - 2), tray);
      tray.setPieCount(2);
    }
    tray.howManyPies();
    littleMyu.interact("climbed into", box);

    littleMyu.interact("rummaged in the contents of the", box);
    Named wool = () -> "angora wool";
    littleMyu.interact("calmly cut several balls of", wool);
    littleMyu.interact("curled up in a cozy pit of", wool);
    joePesci.stateFact("%s kept floating and floating", box);
    joePesci.stateFact("% skidded into the creek," +
            " where the house ran aground", littleMyu);
    joePesci.stateFact("%, swaying in the coastal reeds," +
            " finally bogged down in the silt", box);
    joePesci.stateFact("% dont wake up", littleMyu);
    Named fishingHook = () -> "fishing hook";
    joePesci.stateFact("% hoisted over %", fishingHook,
            littleMyu);
    joePesci.say("Dear reader! Get ready for the unexpected.");
    joePesci.stateFact("% hoisted over %", fishingHook,
            littleMyu);
    joePesci.stateFact("% hooked on %", fishingHook, box);
    joePesci.stateFact("% and % work wonders.", () -> "accidents",
            () -> "coincidences");
    Snusmumriken snus = new Snusmumriken();
    joePesci.stateFact("% doesnt know anything about % and her adventures",
            snus, littleMyu);
    joePesci.stateFact("% doesnt know anything about % and his adventures",
            littleMyu, snus);
    joePesci.stateFact("% and % accidentally" +
            " ended up in the same bay on the very evening of the summer" +
            " solstice", () -> "moomin family", snus);
    joePesci.stateFact("It really was %", snus);
    joePesci.stateFact("In his old green hat, % stood on the shore" +
            " and stared at %", snus, box);
    littleMyu.see(snus);
    snus.see(littleMyu);
    joePesci.stateFact("The last time % and % saw each other, %" +
            " was so small that she could hardly be seen," +
            " so it is not surprising that % and % did not recognize" +
            " each other.",
            littleMyu, snus, littleMyu,
            littleMyu, snus);
    joePesci.stateFact("%s sighed", snus);
    joePesci.stateFact("% came here on an important business," +
            " hoping to be at least a little alone, before returning" +
            " to the Moomin Valley", snus);
    joePesci.stateFact("And then some kind of slumber-mummy" +
            " put her child in %.", box);
    joePesci.say("WOW!");
    joePesci.stateFact("% showed a pipe the % puffing" +
            " above the fire", snus, () -> "small pot of peas");
    joePesci.stateFact("Nearby was another %", () -> "pan of hot coffee");
    joePesci.stateFact("% laughed contemptuously", littleMyu);
    joePesci.stateFact("Without batting an eye, % swallowed two" +
            " teaspoons of coffee and then ate at least four peas" +
            " in addition", littleMyu);

  }
}
