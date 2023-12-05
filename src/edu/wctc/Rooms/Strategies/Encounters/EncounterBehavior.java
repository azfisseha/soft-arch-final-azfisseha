package edu.wctc.Rooms.Strategies.Encounters;

public interface EncounterBehavior {
    boolean isDefeated();
    String fight(boolean hasWeapon);
    int getScoreBonus();
}
