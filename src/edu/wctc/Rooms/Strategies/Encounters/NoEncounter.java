package edu.wctc.Rooms.Strategies.Encounters;

import static edu.wctc.MazeDriver.NULL_ATTEMPT;

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
