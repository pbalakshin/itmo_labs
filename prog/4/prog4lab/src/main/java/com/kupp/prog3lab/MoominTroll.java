package com.kupp.prog3lab;

public class MoominTroll extends Troll implements ThinkingCreature {
  public MoominTroll(String name, TrollTypes type) {
    super(name, type);
  }

  public void interact(String action, Named named) {
    System.out.printf("%s %s %s" +
            "\n", this.getName(), action, named.getName());
  }

  public void lookAround() {
    System.out.printf("%s look around.\n", this.getName());
  }

  public void see(Named named, double meters) {
    String away = new String("far away");
    if (meters <= 1.0) {
      away = new String("next door");
    }
    System.out.printf("%s see %s %s.\n", this.getName(), named.getName(), away);
  }

  public  void see(Named named) {
    System.out.printf("%s see %s at an unknown distance.\n", this.getName(), named.getName());
  }

  public void ponder(int secs) {
    System.out.printf("%s is thinking about it %d secs.\n", this.getName(), secs);
  }

  public void think(String about) {
    System.out.printf("%s think that %s.\n", this.getName(), about);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof MoominTroll)) {
      return false;
    }
    MoominTroll other = (MoominTroll) o;
    return other.getName().equals(this.getName())
            && other.getType().equals(this.getType());
  }

  @Override
  public String toString() {
    return String.format("MoominTroll with name \"%s\"" +
            " & \"%s\" type", this.getName(), this.getType().toString());
  }

  @Override
  public int hashCode() {
    return super.hashCode() + this.getType().getValue();
  }
}
