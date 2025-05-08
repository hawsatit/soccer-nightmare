import java.util.ArrayList;

public class Bedroom extends Room      {                  
    private boolean isLightOn;

    public Bedroom(String ownerName) {
        super("Bedroom", "A cozy bedroom with a bed and a closet.", new ArrayList<Item>() {{
            add(new Waterbottle(3));
        }}, null);
        this.isLightOn = false; // Light is off by default
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

                          

}