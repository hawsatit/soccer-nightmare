
public abstract class Item {
    private String name;
    private String description;
    private Coordinate position;

    public Item(String name, String description, Coordinate position) {
        this.position = position;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Coordinate getPosition() {
        return position;
    }


    public abstract String use();
}