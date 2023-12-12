package edu.wctc.Rooms.Concrete;

import edu.wctc.Rooms.Room;

public class LootRoom extends Room {

    public LootRoom(String name, String description)
    {
        super(name, description);
        this.lootableBehavior = lootBehaviorSimpleFactory.createLootableBehavior("lootable");
    }

    public LootRoom()
    {

    }

}
