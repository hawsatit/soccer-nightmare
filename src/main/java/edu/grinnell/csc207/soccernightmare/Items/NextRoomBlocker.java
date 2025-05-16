package edu.grinnell.csc207.soccernightmare.Items;

import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

/**
 * invsible wall to block the player from moving into the coordinate of the next room
 */
public class NextRoomBlocker extends Item {

    public NextRoomBlocker(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "";
    }
    
}
