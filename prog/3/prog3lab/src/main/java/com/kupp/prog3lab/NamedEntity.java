package com.kupp.prog3lab;

public abstract class NamedEntity implements Named {
  private String name;

  public NamedEntity(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public int hashCode() {
    return getName().hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof NamedEntity)) {
      return false;
    }
    NamedEntity other = (NamedEntity) o;
    return other.getName().equals(this.getName());
  }
}
