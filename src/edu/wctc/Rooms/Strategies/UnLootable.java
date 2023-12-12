package edu.wctc.Rooms.Strategies;

import static edu.wctc.MazeDriver.NULL_ATTEMPT;

public class UnLootable implements LootableBehavior{
    @Override
    public boolean isLooted() {
        return false;
    }

    @Override
    public String loot() {
        return "There is nothing in this room to loot." + NULL_ATTEMPT;
    }

    @Override
    public int lootScoreBonus() {
        return 0;
    }
}
