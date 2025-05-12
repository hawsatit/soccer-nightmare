import java.util.ArrayList;
import java.util.HashMap;

public class Bedroom extends Room{                  

    public Bedroom() {
        super(new Coordinate(0, 0), "Bedroom", "A cozy bedroom with sunlight streaming through the window.", new ArrayList<>(), new LivingRoom(), new HashMap<>(), false);
        generateItems();
    }

    
    public void enter() {
        System.out.println("");
    }

    protected void generateItems() {
                getItems().add(new Waterbottle(3, new Coordinate(0, -1)));
                getItems().add(new Shelf("shelf with trophies and medals", "A shelf adorned with trophies and medals from past victories.", new Coordinate(0, 0)));
                getItems().add(new BedroomWindow("window with curtains", "A window with curtains that can be drawn to let in sunlight.", new Coordinate(1, 0)));
                getItems().add(new Door("door", "A sturdy wooden door leading to the next room.", new Coordinate(0, 1)));
                getItems().add(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(-1, -1)));
                getItems().add(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(-1, 1)));
                getItems().add(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(1, 1)));
                getItems().add(new Wall("wall", "A solid wall that cannot be passed through.", new Coordinate(1, -1)));
    }

}