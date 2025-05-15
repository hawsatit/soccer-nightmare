package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

/**
 * Fence in the game u cant walk through it
 */
public class Fence extends Item {

    public Fence(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "You look at the fence. It is wood ";
    }
    
}
