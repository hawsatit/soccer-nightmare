import java.util.ArrayList;

public class Bedroom extends Room      {                  
    private boolean isLightOn;

    public Bedroom(int[] coordinates, String name, String description, List<Item> items, Room nextRoom) {
        super(coordinates, name, description, items, nextRoom);
        getItems().add(new Waterbottle(3));
    }

    public void toggleLight() {
        isLightOn = !isLightOn;
        System.out.println("The light is now " + (isLightOn ? "on" : "off") + ".");
    }

    public boolean isLightOn() {
        return isLightOn;
    }
    public void enter() {
        System.out.println("You wake up in the bedroom. The sunlight streams through the window, and you feel a sense of calm. It's time to start your adventure.");
    }

    public Go(String direction){        
        if (direction == north){
            
        } else if (direction == east){

        } else if (direction == south){

        } else if (direction == west){

        } else {
            System.out.println("Invalid direction, please use 'north', 'east', 'south', or 'west'");
        }}

    public LookAt(String direction){
        if (direction == north){
            
        } else if (direction == east){

        } else if (direction == south){

        } else if (direction == west){

        } else {
            System.out.println("Invalid direction, please use 'north', 'east', 'south', or 'west'");
        }
    }

    public abstract PickUp(String item){}

    public abstract Use(String item){}

                          

}