package edu.grinnell.csc207.soccernightmare.Items;

import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

public class Bed extends Item {
    
    public Bed(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "You sit on the bed it feels soft and comfortable.";
    }
    
}
