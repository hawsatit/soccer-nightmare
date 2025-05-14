package edu.grinnell.csc207.soccernightmare.Rooms;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;
import edu.grinnell.csc207.soccernightmare.Items.Couch;
import edu.grinnell.csc207.soccernightmare.Items.Door;
import edu.grinnell.csc207.soccernightmare.Items.NextRoomBlocker;
import edu.grinnell.csc207.soccernightmare.Items.Television;
import edu.grinnell.csc207.soccernightmare.Items.Wall;                                                             

import java.util.ArrayList;
import java.util.HashMap;


public class LivingRoom extends Room { 
    public LivingRoom() {
        super(new Coordinate(0, 1), "Living Room", "A cozy living room with a large window overlooking the garden.", 
              new ArrayList<>(), null, null, new HashMap<>(), false);
        generateItems();
    }
        protected void generateItems() {
                addItemToRoom(new Door("Living Room Door", "A door leading to the living room.", new Coordinate(0, 1)));
                addItemToRoom(new Couch("Couch", "A comfortable couch perfect for relaxing.", new Coordinate(0, 2)));
                addItemToRoom(new Television("TV", "A modern flat-screen television.", new Coordinate(1, 2)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(-1, 1)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(1, 1)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(-1, 2)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(-1, 3)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(0, 3)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(1, 3)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(2, 3)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(2, 1)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(0, -2)));
                addItemToRoom(new Wall("Wall", "A sturdy wall.", new Coordinate(-1, 2)));
                addItemToRoom(new Door("Exit Door", "A door leading to the practice pitch", new Coordinate(2, 2)));
                addItemToRoom(new NextRoomBlocker("Next Room Blocker", "A sturdy wall.", new Coordinate(0,1)));
                addItemToRoom(new NextRoomBlocker("Next Room Blocker", "A sturdy wall.", new Coordinate(3,2)));
        }
    

    public void enter() {
        System.out.println("You enter the living room. It's spacious and well-lit, with a large window overlooking the garden.");
    }   
}
