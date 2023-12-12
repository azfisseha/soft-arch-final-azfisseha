package edu.wctc.Rooms.Strategies;

import edu.wctc.Loot.Loot;

public interface LootableBehavior {
    boolean isLooted();
    Loot loot();
    int lootScoreBonus();
}
