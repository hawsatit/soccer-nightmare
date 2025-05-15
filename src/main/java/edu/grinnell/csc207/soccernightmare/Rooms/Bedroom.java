package edu.grinnell.csc207.soccernightmare.Rooms;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;
import edu.grinnell.csc207.soccernightmare.Items.Bed;
import edu.grinnell.csc207.soccernightmare.Items.Waterbottle;
import edu.grinnell.csc207.soccernightmare.Items.Shelf;
import edu.grinnell.csc207.soccernightmare.Items.BedroomWindow;
import edu.grinnell.csc207.soccernightmare.Items.Door;
import edu.grinnell.csc207.soccernightmare.Items.NextRoomBlocker;
import edu.grinnell.csc207.soccernightmare.Items.Wall;         
import edu.grinnell.csc207.soccernightmare.Items.WindowBlocker;     

import java.util.ArrayList;
import java.util.HashMap;

/**
 * the bedroom
 */
public class Bedroom extends Room{                  

    public Bedroom() {
        super(new Coordinate(0, 0), "Bedroom", 
              "A cozy bedroom with sunlight streaming through the window.",
              new ArrayList<>(), null, null, new HashMap<>(), false); // <- Don't call new LivingRoom()
        generateItems();
    }

    
    public void enter() {
        System.out.println("");
    }

    protected void generateItems() {
        addItemToRoom(new Waterbottle(3, new Coordinate(0, -1)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(0, -2)));
        addItemToRoom(new Shelf("shelf", "A shelf adorned with trophies and medals from past victories.", new Coordinate(-1, 0)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(-2, 0)));
        addItemToRoom(new BedroomWindow("window", "A window with curtains that can be drawn to let in sunlight.", new Coordinate(1, 0)));
        addItemToRoom(new Door("living room door", "A sturdy wooden door leading to the next room.", new Coordinate(0, 1)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(-1, -1)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(-1, 1)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(1, 1)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(1, -1)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(1, -1)));
        addItemToRoom(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(2, 0)));
        addItemToRoom(new Bed("bed", "The original spawn point, a cozy bed with soft pillows and a warm blanket.", new Coordinate(0, 0)));
        addItemToRoom(new WindowBlocker("Window Blocker", "blocking the window", new Coordinate(2, 0)));
        addItemToRoom(new NextRoomBlocker("Next Room Blocker", "blocking the next room", new Coordinate(0, 2)));

    }
    

}