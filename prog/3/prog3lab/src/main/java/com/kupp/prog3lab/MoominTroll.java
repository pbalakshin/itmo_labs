package com.kupp.prog3lab;

public class MoominTroll extends Troll implements ThinkingCreature {
  public MoominTroll(String name, TrollTypes type) {
    super(name, type);
  }

  protected void interact(String action, Named named) {
    System.out.printf("%s %s %s\n", this.getName(), action, named.getName());
  }

  public void think(String about) {
    System.out.printf("%s think that %s\n", this.getName(), about);
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
