package edu.wctc.Rooms.Concrete;

import edu.wctc.Enemies.Enemy;
import edu.wctc.Rooms.Room;
import edu.wctc.Rooms.Strategies.Lootable;

public class EnemyEncounterRoom extends Room {

    public EnemyEncounterRoom(String name, String description, Enemy enemy) {
        super(name, description, enemy);
    }

}
