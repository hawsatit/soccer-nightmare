import java.util.List;

public abstract class Room {
    private String name;
    private String description;
    private List<Item> items;
    private Room nextRoom;
    private int[] coordinates;

    public Room(int[] coordinates, String name, String description, List<Item> items, Room nextRoom) {
        this.coordinates = coordinates;
        this.name = name;
        this.description = description;
        this.items = items;
        this.nextRoom = nextRoom;   
    }

    public abstract Room go(String direction);
    public abstract void lookAt(String direction);
    public abstract void use(Item item);
    public abstract void pickUp(Item item);

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public List<Item> getItems() {
        return items;
    }

    public Room getNextRoom() {
        return nextRoom;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public abstract void enter();
}
}