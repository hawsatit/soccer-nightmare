package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

/**
 * Represents the TV in the game
 */
public class Television extends Item{
    boolean hasRemote;
    
    public Television(String name, String description, Coordinate position) {
        super(name, description, position);
        hasRemote = false;
    }
    
    public void pickUpRemote(){
        this.hasRemote = true;
    }

    @Override
    public String use() {
        if (hasRemote){
            return "You turn on the television. The screen lights up, displaying an ongoing football match. You see a player who looks like you walk up to take a penalty...";        
        } else {
            return "You need to find the remote first!";
        }
    }
}
