package edu.wctc.Rooms.Strategies.Encounters;

import java.util.Random;

import static edu.wctc.MazeDriver.NULL_ATTEMPT;

public class TrollEncounter implements EncounterBehavior{
    private boolean defeated;
    private int scoreBonus;
    public TrollEncounter()
    {
        defeated = false;
        scoreBonus = 200;
    }

    @Override
    public boolean isDefeated() {
        return false;
    }

    @Override
    public String fight(boolean hasWeapon) {
        if(hasWeapon){
            defeated = new Random().nextDouble() > 0.7;
            if(defeated)
                return "You defeat the troll!";
        }

        String defeatText = "The troll smacks you to the ground with an effortless grunt. You hear a crunch as you land - was that the ground, or your rib?";
        if(hasWeapon) return defeatText;
        return defeatText + NULL_ATTEMPT;
    }

    @Override
    public int getScoreBonus() {
        return defeated ? scoreBonus : scoreBonus / 2;
    }
}
