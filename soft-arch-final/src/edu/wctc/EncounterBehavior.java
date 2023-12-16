package edu.wctc.Rooms.Strategies.Encounters;

import edu.wctc.Loot.Weapon;

public interface EncounterBehavior {
    boolean isDefeated();
    EncounterActionDetail fight(Weapon weapon);
    int getPoints();
}
