public class Fence extends Item {

    public Fence(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "You look at the fence. It is wood ";
    }
    
}
