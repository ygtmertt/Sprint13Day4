package org.example;

public enum Weapon {
  SWORD(35, 3.6),
  BOW(15, 1.5),
  LANCE(50, 5.2),
  HAMMER(40, 4.3),
  AXE(28, 2.8);

  private final int damage;
  private final double attackSpeed;

  Weapon(int damage, double attackSpeed) {
    this.damage = damage;
    this.attackSpeed = attackSpeed;
  }

  public int getDamage() {
    return damage;
  }

  public double getAttackSpeed() {
    return attackSpeed;
  }
}
