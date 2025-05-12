import java.util.ArrayList;
import java.util.HashMap;


public class LivingRoom extends Room { 
    public LivingRoom() {
        super(new Coordinate(0, 1), "Living Room", "A cozy living room with a large window overlooking the garden.", 
              new ArrayList<>(), null, new HashMap<>(), false);
        generateItems();
    }
        protected void generateItems() {
                getItems().add(new Door("Living Room Door", "A door leading to the living room.", new Coordinate(0, 1)));
                getItems().add(new Couch("Cozy Couch", "A comfortable couch perfect for relaxing.", new Coordinate(0, 2)));
                getItems().add(new Television("Flat-Screen TV", "A modern flat-screen television.", new Coordinate(1, 2)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(-1, 1)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(1, 1)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(-1, 2)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(-1, 3)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(0, 3)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(1, 3)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(2, 3)));
                getItems().add(new Wall("Wall", "A sturdy wall.", new Coordinate(2, 1)));
                getItems().add(new Door("Exit Door", "A door leading to the practice pitch", new Coordinate(2,2)));
        }
    

    public void enter() {
        System.out.println("You enter the living room. It's spacious and well-lit, with a large window overlooking the garden.");
    }   
}
