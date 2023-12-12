package edu.wctc.Rooms.Strategies;

import edu.wctc.Loot.Loot;

import static edu.wctc.MazeIO.NULL_ATTEMPT;

public class UnLootable implements LootableBehavior{
    @Override
    public boolean isLooted() {
        return false;
    }

    @Override
    public Loot loot() {
        return null;
    }

    @Override
    public int lootScoreBonus() {
        return 0;
    }
}
