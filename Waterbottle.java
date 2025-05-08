public class Waterbottle extends Item {
    private int waterAmount; // Amount of water in the bottle

    public Waterbottle(int waterAmount) {
        super("watterbottle", "A bottle filled with refreshing water.", true);
        this.waterAmount = waterAmount;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    @Override
    public String use() {
        if (waterAmount > 0) {
            waterAmount--;
            return "You take a sip from the " + getName() + ". You feel refreshed!";
        } else {
            return "The " + getName() + " is empty.";
        }
    }
}