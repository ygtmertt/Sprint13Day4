package org.example;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Jack", 80, Weapon.AXE);
        System.out.println(player.healthRemaining());
    }
}