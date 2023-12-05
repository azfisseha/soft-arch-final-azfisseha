package edu.wctc.Rooms.Strategies.Encounters;

import java.util.Random;

import static edu.wctc.Main.NULL_ATTEMPT;

public class ZombieEncounter implements EncounterBehavior{
    private boolean defeated;
    private int scoreBonus;
    private int enemyCount;

    public ZombieEncounter()
    {
        defeated = false;
        enemyCount = new Random().nextInt(3) + 1;
        scoreBonus = enemyCount * 10;
    }

    @Override
    public boolean isDefeated() {
        return false;
    }

    @Override
    public String fight(boolean hasWeapon) {
        if(defeated)
            return "You have already defeated the zombies in this room.";
        if(hasWeapon){
            defeated = true;
            return String.format("You defeat %d zombies!", enemyCount);
        }
        else {
            return String.format("The %d zombies overwhelm you, but you manage to break free before getting bit.%s", enemyCount, NULL_ATTEMPT);
        }
    }

    @Override
    public int getScoreBonus() {
        return defeated ? scoreBonus : scoreBonus / 2;
    }
}
