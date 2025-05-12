public class Goalpost extends Item{
    public Goalpost(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    @Override
    public String use() {
        return "You inspect the goalpost. It looks perfect for a game of football or for a ball to be shot into. :)";
    }
    
}
