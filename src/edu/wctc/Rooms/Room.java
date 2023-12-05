package edu.wctc.Rooms;

import edu.wctc.Rooms.Strategies.Encounters.EncounterBehavior;
import edu.wctc.Rooms.Strategies.InteractableBehavior;
import edu.wctc.Rooms.Strategies.LootBehaviorSimpleFactory;
import edu.wctc.Rooms.Strategies.LootableBehavior;

public abstract class Room {
    private String name;
    private String description;

    protected InteractableBehavior interactableBehavior;
    protected LootableBehavior lootableBehavior;
    protected EncounterBehavior encounterBehavior;
    protected LootBehaviorSimpleFactory lootBehaviorSimpleFactory;

    public String getName() { return name; }
    public String getDescription() { return description; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.lootBehaviorSimpleFactory = new LootBehaviorSimpleFactory();
    }

    //Room getAdjoiningRoom();
}
