package edu.grinnell.csc207.soccernightmare.Rooms;   

import edu.grinnell.csc207.soccernightmare.Data.Coordinate;
import edu.grinnell.csc207.soccernightmare.Items.Door;
import edu.grinnell.csc207.soccernightmare.Items.Fence;
import edu.grinnell.csc207.soccernightmare.Items.Football;
import edu.grinnell.csc207.soccernightmare.Items.Goalpost;
import edu.grinnell.csc207.soccernightmare.Items.NextRoomBlocker;
import edu.grinnell.csc207.soccernightmare.Items.Sign;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * the Practice pitch room
 */
public class PracticePitch extends Room{
    public PracticePitch() {
        super( new Coordinate(2, 2),"Practice Pitch", "A well-maintained practice pitch with goalposts at either end.",new ArrayList<>(),null, null, new HashMap<>(), true);
        generateItems();
    }

    @Override   
    public void enter() {
        System.out.println("You step onto the practice pitch. The grass is well-maintained, and you can see the goalposts at either end. It's a perfect day for some practice.");
    }

    @Override
    protected void generateItems() {
        addItemToRoom(new Door("Exit Door", "A wooden door leading back to the living room.", new Coordinate(2, 2)));
        addItemToRoom(new Goalpost("Goalpost", "A sturdy goalpost for practicing your shots.", new Coordinate(5, 2)));
        addItemToRoom(new Football("Football", "A standard football, perfect for kicking around.", new Coordinate(4, 2)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(2, 3)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(2, 1)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(3, 3)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(3, 1)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(4, 3)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(4, 1)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(5, 3)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(5, 1)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(6, 1)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(6, 2)));
        addItemToRoom(new Fence("Fence", "A tall fence to keep the ball from going out of bounds.", new Coordinate(6, 3)));
        addItemToRoom(new Sign("Sign", "Bob's Practice Field - The goalpost is to the north, and the football is at the center.", new Coordinate(3, 2)));
        addItemToRoom(new NextRoomBlocker("Next Room Blocker", "blocks the next room", new Coordinate(1, 2)));
    }
}