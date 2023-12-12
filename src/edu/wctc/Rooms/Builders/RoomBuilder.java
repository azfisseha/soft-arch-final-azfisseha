package edu.wctc.Rooms.Builders;


import edu.wctc.Rooms.Room;

import java.util.Locale;

public abstract class RoomBuilder {
    public Room buildRoom(String type, String name, String description)
    {
        //TODO:
        Room room = createRoom(type);


        return null;
    }

    //TODO: the factory method
    protected abstract Room createRoom(String type);
}
