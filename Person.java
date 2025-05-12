import java.util.ArrayList;
import java.util.List;

package soccer.nightmare;


public class Person {
    private List<Item> hands;

    public Person() {
        this.hands = new ArrayList<>();
    }

    public void holdItem(Item item) {
        if (hands.size() < 2) { // Assuming a person has two hands
            hands.add(item);
        } else {
            System.out.println("Both hands are already holding items!");
        }
    }

    public void dropItem(Item item) {
        if (hands.remove(item)) {
            System.out.println("Item dropped: " + item.getName());
        } else {
            System.out.println("Item not found in hands.");
        }
    }

    public List<Item> getHands() {
        return hands;
    }

    public String command (Item item, String command) {
        if (command.equals("use")) {
            return item.use();
        } else if (command.equals("drop")) {
            dropItem(item);
            return "Item dropped: " + item.getName();
        } else {
            return "Invalid command.";
        }
    }

    public void pickUpItem(Item item) {
        if (hands.size() < 2) {
            holdItem(item);
            System.out.println("Picked up: " + item.getName());
        } else {
            System.out.println("Cannot pick up item. Both hands are occupied.");
        }
    }
    public void dropItem() {
        if (!hands.isEmpty()) {
            Item item = hands.remove(hands.size() - 1);
            System.out.println("Dropped: " + item.getName());
        } else {
            System.out.println("No items to drop.");
        }
    }

    public void showHands() {
        if (hands.isEmpty()) {
            System.out.println("No items in hands.");
        } else {
            System.out.println("Items in hands:");
            for (Item item : hands) {
                System.out.println("- " + item.getName());
            }
        }
    }

    public boolean isHolding(String itemName) {
        for (Item item : hands) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }
}