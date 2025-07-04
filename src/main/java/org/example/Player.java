package org.example;

public class Player {

  private String name;
  private int healthPercentage;
  private Weapon weapon;

  public Player(String name, int healthPercentage, Weapon weapon) {
    if(healthPercentage>100) {
      this.healthPercentage = 100;
    }
    else if (healthPercentage<0) {
      this.healthPercentage = 0;
    }
    else {
      this.healthPercentage = healthPercentage;
    }
    this.name = name;
    this.weapon = weapon;
  }

  public int healthRemaining() {
    return this.healthPercentage;
  }

  public void loseHealth(int damage) {
    this.healthPercentage -= damage;
    if(this.healthPercentage < 0) {
      this.healthPercentage = 0;
      System.out.println(name + " player has been knocked out of game");
    }
  }

  public void restoreHealth(int healthPotion) {
    this.healthPercentage += healthPotion;
    if(this.healthPercentage > 100) {
      this.healthPercentage = 100;
    }
  }

}
