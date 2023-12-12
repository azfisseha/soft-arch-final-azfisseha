package edu.wctc.Rooms.Strategies.Encounters;

import java.util.Random;

import static edu.wctc.MazeIO.NULL_ATTEMPT;

public class PuppyEncounter implements EncounterBehavior{
    private boolean defeated;
    private int scoreBonus;
    private int enemyCount;

    public PuppyEncounter()
    {
        defeated = false;
        enemyCount = new Random().nextInt(2) + 4;

        //Who goes around attacking puppies? Negative points for victory!
        scoreBonus = -enemyCount * 20;
    }

    @Override
    public boolean isDefeated() {
        return false;
    }

    @Override
    public String fight(boolean hasWeapon) {
        if(defeated)
            return "You've spent enough time here with the puppies (yes, there is such a thing)." + NULL_ATTEMPT;
        if(hasWeapon){
            defeated = true;
            return String.format("You defeated %d puppies!\n\t......are you proud of yourself?", enemyCount);
        }
        else{
            return "You stop to play with the puppies.";
        }
    }

    @Override
    public int getScoreBonus() {
        return defeated ? scoreBonus : -scoreBonus;
    }
}
