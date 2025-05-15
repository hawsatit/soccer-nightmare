package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;

/**
 * represents the waterbottle in the game. 
 * We will make it so you have to drink water before 6 trials
 * or else you die of dehydration
 */
public class Waterbottle extends Item {
    private int waterAmount; // Amount of water in the bottle

    public Waterbottle(int waterAmount, Coordinate position) {
        super("waterbottle", "A bottle filled with refreshing water.", position);
        this.waterAmount = waterAmount;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    @Override
    public String use() {
        if (waterAmount > 0) {
            waterAmount--;
            return "You take a sip from the " + getName() + ". You feel refreshed!";
        } else {
            return "The " + getName() + " is empty.";
        }
    }
}