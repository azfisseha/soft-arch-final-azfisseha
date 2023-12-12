package edu.wctc.Rooms.Strategies;

import edu.wctc.Loot.Loot;

public class Lootable implements LootableBehavior{
    private boolean looted = false;
    private Loot loot;

    public Lootable(Loot loot)
    {
        this.loot = loot;
    }

    @Override
    public boolean isLooted() {
        return looted;
    }

    @Override
    public Loot loot() {
        if(looted)
            return null;
        else {
            looted = true;
            return loot;
        }
    }

    @Override
    public int lootScoreBonus() {
        return loot.getLootScoreBonus();
    }
}
