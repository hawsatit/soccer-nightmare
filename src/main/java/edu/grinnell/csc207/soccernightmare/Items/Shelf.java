package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

/**
 * Represents the shelf in the game.
 */
public class Shelf extends Item {

    public Shelf(String name, String description, Coordinate position) {
        super(name, description, position);
    }


    @Override
    public String use() {
        return "You look at the shelf. It contains varioius medals and shiny trophies " ;
    }
}
