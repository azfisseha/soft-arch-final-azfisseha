package edu.wctc.Rooms.Strategies.Encounters;

import edu.wctc.Rooms.Strategies.Encounters.EncounterBehavior;

import static edu.wctc.Main.NULL_ATTEMPT;

public class NoEncounter implements EncounterBehavior {
    @Override
    public boolean isDefeated() {
        return false;
    }

    @Override
    public String fight(boolean hasWeapon) {
        return "There is nothing to fight here." + NULL_ATTEMPT;
    }

    @Override
    public int getScoreBonus() {
        return 0;
    }
}
