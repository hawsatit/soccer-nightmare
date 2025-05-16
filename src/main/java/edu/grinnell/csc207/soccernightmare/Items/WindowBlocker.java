package edu.grinnell.csc207.soccernightmare.Items;

import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

/**
 * inviisble wall to prevent you from going out the window
 */
public class WindowBlocker extends Item {

    public WindowBlocker(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "";
    }
    
}
