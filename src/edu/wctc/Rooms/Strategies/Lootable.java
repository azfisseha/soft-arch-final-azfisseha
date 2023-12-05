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
    public String loot() {
        looted = true;
        return loot.getDescription();
    }

    @Override
    public int lootScoreBonus() {
        return loot.getLootScoreBonus();
    }
}
