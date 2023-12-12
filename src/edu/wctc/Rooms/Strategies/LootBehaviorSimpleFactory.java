package edu.wctc.Rooms.Strategies;

import edu.wctc.Loot.Loot;
import edu.wctc.Loot.LootGenerator;

public class LootBehaviorSimpleFactory{
    private LootGenerator rngLootFactory;

    public LootBehaviorSimpleFactory()
    {
        rngLootFactory = LootGenerator.getInstance();
    }

    public LootableBehavior createLootableBehavior(String lootableBehavior)
    {
        LootableBehavior lootable = null;
        switch (lootableBehavior.toLowerCase().charAt(0)) {
            case 'u'-> lootable = new UnLootable();
            //TODO:
            case 'l'-> lootable = new Lootable(rngLootFactory.getLoot(""));
            case 'r'-> lootable = new Lootable(rngLootFactory.getLoot());
        }

        return lootable;
    }
}
