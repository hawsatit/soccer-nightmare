package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

/**
 * A wall that you cannot walk through.
 */
public class Wall extends Item {

    public Wall(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "You look at the wall. It is white.";
    }
}
