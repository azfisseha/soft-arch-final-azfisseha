package edu.wctc.Rooms.Strategies.Encounters;

import java.util.Random;

import static edu.wctc.MazeIO.NULL_ATTEMPT;

public class SkeletonEncounter implements EncounterBehavior{

    private boolean defeated;
    private int scoreBonus;
    private int enemyCount;

    public SkeletonEncounter()
    {
        defeated = false;
        enemyCount = new Random().nextInt(5) + 2;
        scoreBonus = enemyCount * 15;
    }

    @Override
    public boolean isDefeated() {
        return false;
    }

    @Override
    public String fight(boolean hasWeapon) {
        if(defeated)
            return "You have already defeated the skeletons in this room." + NULL_ATTEMPT;
        if(hasWeapon){
            defeated = true;
            return String.format("You defeat %d skeletons!", enemyCount);
        }
        else {
            return String.format("The %d zombies overwhelm you, but you manage to break free before getting bit.%s", enemyCount, NULL_ATTEMPT);
        }
    }

    @Override
    public int getScoreBonus() {
        return defeated ? scoreBonus : scoreBonus / 3;
    }
}
