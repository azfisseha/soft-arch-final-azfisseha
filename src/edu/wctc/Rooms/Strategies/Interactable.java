package edu.wctc.Rooms.Strategies;

public class Interactable implements InteractableBehavior{
    private boolean interacted = false;
    private int interactScoreBonus;
    private String interactText;

    public Interactable(String interactText, int interactScoreBonus)
    {
        this.interactText = interactText;
        this.interactScoreBonus = interactScoreBonus;
    }

    @Override
    public boolean hasBeenInteractedWith() {
        return interacted;
    }

    @Override
    public int interactScoreBonus() {
        return interactScoreBonus;
    }

    @Override
    public String interact() {
        interacted = true;
        return interactText;
    }
}
