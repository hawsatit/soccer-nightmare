package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;


public class Football extends Item {
    private String kickDirection;


    public Football(String name, String description, Coordinate position) {
        super(name, description, position);
    }


    @Override
    public String use(){
        return "You juggle the football, feeling its weight and texture in your hands. It's a perfect to 'kick the ball'.";
    }
}
