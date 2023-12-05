package edu.wctc.Rooms.Strategies;

public interface LootableBehavior {
    boolean isLooted();
    String loot();
    int lootScoreBonus();
}
