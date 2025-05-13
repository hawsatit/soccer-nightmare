package edu.grinnell.csc207.soccernightmare.Items;
import edu.grinnell.csc207.soccernightmare.Data.Coordinate;


public class Football extends Item {
    private String kickDirection;


    public Football(String name, String description, Coordinate position) {
        super(name, description, position);
    }


    @Override
    public String use(){
        return "You see a ball that you can 'kick' in a direction :)";
    }
    
    private void setKickDirection(String kickDirection) {
        this.kickDirection = kickDirection;
    }

    public String getKickDirection() {
        return kickDirection;
    }
    public void kick(String direction) {
            setKickDirection(direction);
            System.out.println("You kick the ball " + direction + ".");
            switch (direction.toLowerCase()) {
                case "east":
                case "west":
                    System.out.println("It hits the post and bounces back to its original position!");
                    break;
                case "south":
                    System.out.println("It rolls through the door back into the living room!");
                    break;
                case "north":
                    System.out.println("Goal! You score into the post!");
                    break;
                default:
                    System.out.println("It doesn't seem to go anywhere special.");
                    break;
            }
    }   
}
