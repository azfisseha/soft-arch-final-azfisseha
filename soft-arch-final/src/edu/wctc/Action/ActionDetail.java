package edu.wctc;

public abstract class ActionDetail {
    private String detail;
    private int points;
    private boolean success;
    
    public int getPoints()
    {
        return points;
    }

    public boolean getSuccess()
    {
        return success;
    }

    public String getDetail()
    {
        return detail;
    }
}
