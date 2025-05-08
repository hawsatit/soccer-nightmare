import java.util.List;

public abstract class Room {
    private String name;
    private String description;
    private List<Item> items; // List of items in the room
    private Room nextRoom; // Next room to go to

    public Room(String name, String description, List<Item> items, Room nextRoom) {
        this.name = name;
        this.description = description;
        this.items = items;
        this.nextRoom = nextRoom;   
    }

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

    public abstract void enter();
}