package edu.wctc.Rooms.Strategies;

import static edu.wctc.Main.NULL_ATTEMPT;

public class UnInteractable implements InteractableBehavior{
    @Override
    public boolean hasBeenInteractedWith() {
        return false;
    }

    @Override
    public int interactScoreBonus() {
        return 0;
    }

    @Override
    public String interact() {
        return "There is nothing of note worth interacting with here." + NULL_ATTEMPT;
    }
}
