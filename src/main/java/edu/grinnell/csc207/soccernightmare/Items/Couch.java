package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;


public class Couch extends Item {

    public Couch(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "You sit on the couch. It's comfortable and soft, perfect for relaxing. You also see a TV remote on the couch you can 'pick up remote'";
    }
}