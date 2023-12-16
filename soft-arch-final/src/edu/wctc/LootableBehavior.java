package edu.wctc.Rooms.Strategies;

import edu.wctc.Loot.Loot;
import edu.wctc.LootActionDetail;

public interface LootableBehavior {
    boolean isLooted();
    LootActionDetail loot();
    int lootPoints();
}
