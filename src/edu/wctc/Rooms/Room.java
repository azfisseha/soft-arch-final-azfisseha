package edu.wctc.Rooms;

import edu.wctc.Directions;
import edu.wctc.Loot.Loot;
import edu.wctc.Player;
import edu.wctc.Rooms.Strategies.Encounters.EncounterBehavior;
import edu.wctc.Rooms.Strategies.InteractableBehavior;
import edu.wctc.Rooms.Strategies.LootBehaviorSimpleFactory;
import edu.wctc.Rooms.Strategies.LootableBehavior;

public abstract class Room {
    private String name;
    private String description;

    private Room[] adjoiningRooms = new Room[4];

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

    public abstract void initialize(String data);
    public abstract void initialize();

    public String interact(Player player)
    {
        //TODO:
        if(!interactableBehavior.hasBeenInteractedWith())
            interactableBehavior.interactScoreBonus()
        return interactableBehavior.interact();
    }
    public Loot loot(Player player)
    {
        return lootableBehavior.loot();
    }
    public String fight(Player player)
    {
        return encounterBehavior.fight(player.hasWeapon());
    }

    @Override
    public String toString() {
        return this.getDescription() + ": \n\t" + this.getDescription();
    }

    public Room getAdjoiningRoom(Directions dir)
    {
        return adjoiningRooms[dir.getIndexOf()];
    }

    public void setAdjoiningRoom(Directions dir, Room room)
    {
        adjoiningRooms[dir.getIndexOf()] = room;
    }
}
