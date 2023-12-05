package edu.wctc.Rooms.Strategies;

public interface InteractableBehavior {
    boolean hasBeenInteractedWith();
    int interactScoreBonus();
    String interact();
}
