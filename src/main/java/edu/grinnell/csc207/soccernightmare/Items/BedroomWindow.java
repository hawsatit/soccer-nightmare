package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;


public class BedroomWindow extends Item {
    private boolean curtainsClosed = true;


    public BedroomWindow(String name, String description, Coordinate position) {
        super(name, description, position);
    }


    public void toggleCurtains() {
        curtainsClosed = !curtainsClosed;
    }

    public void openCurtains() {
        curtainsClosed = false;
    }

    @Override
    public String use() {
        if (curtainsClosed) {
            return "The curtains are closed. You can't see anything. Maybe you should open them.";
        } else {
            return "You open the window and look out. The view is beautiful, and you can see the green soccer field grass. The breeze is refreshing.";
        }
    }
    
}
