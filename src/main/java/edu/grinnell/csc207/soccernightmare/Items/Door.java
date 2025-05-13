package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;


public class Door extends Item {
    private boolean isOpen;

    public Door(String name, String description, Coordinate position) {
        super(name, description, position);
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public String use() {
        if (isOpen) {
            isOpen = false;
            return "You close the door.";
        } else {
            isOpen = true;
            return "You open the door. Looks like you can 'walk through the door' now.";
        }
    }
    
}
