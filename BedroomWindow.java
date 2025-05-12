public class BedroomWindow extends Item {
    private boolean curtainsClosed = true;


    public BedroomWindow(String name, String description, Coordinate position) {
        super(name, description, position);
    }


    public void toggleCurtains() {
        curtainsClosed = !curtainsClosed;
    }

    @Override
    public String use() {
        if (curtainsClosed) {
            return "The curtains are closed. You can't see anything.";
        } else {
            return "You open the window and look out. The view is beautiful, and you can see the green soccer field grass.";
        }
    }
    
}
