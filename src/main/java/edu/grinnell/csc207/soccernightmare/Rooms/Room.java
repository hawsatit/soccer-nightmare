package edu.grinnell.csc207.soccernightmare.Rooms;
     

import edu.grinnell.csc207.soccernightmare.Data.Command;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;
import edu.grinnell.csc207.soccernightmare.Items.BedroomWindow;
import edu.grinnell.csc207.soccernightmare.Items.Door;
import edu.grinnell.csc207.soccernightmare.Items.Item;
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

    public Room performCommand(Command command) {
        switch (command.getType()) {
            case GO:
                go(command.getArgument());
                return this;
            case LOOK:
                lookAt(command.getArgument());
                return this;
            case USE:
                Item itemToUse = getItemByName(command.getArgument());
                if (itemToUse != null && getSpawn().equals(itemToUse.getPosition())) {
                    System.out.println(itemToUse.use());
                } else {
                    System.out.println("Item not accessible.");
                }
                return this;
            case KICK:
                System.out.println("You kick the ball");
                return null;
            case LIGHT:
                toggleLight();
                return this;
            case OPEN_CURTAIN:
                if (getItemByName("window") != null) {
                    BedroomWindow window = (BedroomWindow) getItemByName("window");
                    if (window != null) {
                        window.openCurtains();
                    } else {
                        System.out.println("No window found to open curtains.");
                    }
                    System.out.println("You open the curtain an can use the window");
                } else {
                    System.out.println("There is no curtain to open.");
                }
                return this;
            case WALK:
                Door doorAtPosition = getDoorAtPosition(getSpawn());
                if (doorAtPosition != null) {
                    if (doorAtPosition.isOpen()) {
                        System.out.println("You walk through the door to the next room.");
                        return getNextRoom();
                    } else {
                        System.out.println("The door is closed. You can't walk through.");
                    }
                } else {
                    System.out.println("You need to be at the door to walk to the next room.");
                }
                return nextRoom;
            case UNKNOWN:
                System.out.println("Unknown command. Please try again.");
                return this;
            default:
                System.out.println("You can't do that right now.");
                return this;
        }
    }

    private Door getDoorAtPosition(Coordinate position) {
        for (Item item : items) {
            if (item instanceof Door && item.getPosition().equals(position)) {
                return (Door) item;
            }
        }
        return null;
    }
    

    public Item getItemByName(String itemName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

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
        Coordinate currentCoord = getSpawn();
        Coordinate nextCoord = getNextCoordinate(direction);
        
        if (nextCoord == null) {
            System.out.println("Invalid direction. Please use 'north', 'east', 'south', or 'west'.");
            return;
        }
    
        Item currentItem = getItemsMap().get(currentCoord);
        Item nextItem = getItemsMap().get(nextCoord);
    
        // Prevent moving past a window
        if (currentItem != null && currentItem.getName().equalsIgnoreCase("Window")) {
            System.out.println("You can't go past the window.");
            return;
        }
    
        // Prevent walking into walls
        if (nextItem != null && nextItem.getName().equalsIgnoreCase("Wall")) {
            System.out.println("You can't go through the wall.");
            return;
        }
    
        // Allow movement
        if (nextItem == null) {
            System.out.println("You move to an empty space.");
        } else {
            System.out.println("You move toward the " + nextItem.getName() + ".");
        }
    
        setSpawn(nextCoord);
        System.out.println("You are now at " + getSpawn().getX() + ", " + getSpawn().getY() + ".");
    }
    

    protected void addItemToRoom(Item item) {
        items.add(item);
        itemsMap.put(item.getPosition(), item);
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
            System.out.println("The item is at" + item.getPosition().getX() + ", " + item.getPosition().getY() + ".");
        }

    }

}