import java.util.List;
import java.util.Map;

public abstract class Room {
    private String name;
    private String description;
    private List<Item> items;
    private Room nextRoom;
    private Coordinate spawn;
    private Map<Coordinate,Item> itemsMap;
    private boolean isLightOn;

    public Room(Coordinate spawn, String name, String description, List<Item> items, Room nextRoom, Map<Coordinate,Item> itemsMap, boolean isLightOn) {
        this.isLightOn = isLightOn;
        this.itemsMap = itemsMap;
        this.spawn = spawn;
        this.name = name;
        this.description = description;
        this.items = items;
        this.nextRoom = nextRoom;   
    }

    public abstract void enter();
    protected abstract void generateItems();

    private Coordinate getNextCoordinate(String direction) {
        int x = getSpawn().getX();
        int y = getSpawn().getY();
    
        switch (direction) {
            case "north": return new Coordinate(x, y + 1);
            case "east":  return new Coordinate(x + 1, y);
            case "south": return new Coordinate(x, y - 1);
            case "west":  return new Coordinate(x - 1, y);
            default:
                System.out.println("Invalid direction. Please use 'north', 'east', 'south', or 'west'.");
                return null;
        }
    }

    public void toggleLight() {
        isLightOn = !isLightOn;
        System.out.println("The light is now " + (isLightOn ? "on" : "off") + ".");
    }

    public void lookAt(String direction){
        if (!isLightOn) {
            System.out.println("It's too dark to see anything. Turn on the light first.");
            return;
        }
        Coordinate tempCoord = getNextCoordinate(direction);
       
        Item item = getItemsMap().get(tempCoord);
        if (item != null) {
            System.out.println("You see " + item.getName() + ".");
        } else {
            System.out.println("There's nothing to see in that direction.");
        }
    }

    public void go(String direction) {
        Coordinate tempCoord = getNextCoordinate(direction);
        if (tempCoord == null) {
            System.out.println("Invalid direction. Please use 'north', 'east', 'south', or 'west'.");
            return;
        }
        Item item = getItemsMap().get(tempCoord);
        if (item != null) {
            System.out.println("You move towards the " + item.getName() + ".");
            setSpawn(tempCoord);
        } else {
            System.out.println("The " + getItemsMap().get(getSpawn()).getName() + " is blocking your way.");
            setSpawn(tempCoord);
        }
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

    public Coordinate getPosition() {
        return spawn;
    }
    public Coordinate getSpawn() {
        return spawn;
    }
    public void setSpawn(Coordinate spawn) {
        this.spawn = spawn;
    }
    public Map<Coordinate, Item> getItemsMap() {
        return itemsMap; 
    }
    public void use(Item item){
        if (getItems().contains(item) && getSpawn().equals(item.getPosition())) {
            System.out.println(item.use());
        } else {
            System.out.println("Item not accessible.");
        }

    }
}