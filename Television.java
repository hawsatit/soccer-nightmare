public class Television extends Item{
    public Television(String name, String description, Coordinate position) {
        super(name, description, position);
    }


    @Override
    public String use() {
        return "You turn on the television. The screen lights up, displaying an ongoing football match. You see a player who looks like you walk up to take a penalty...";
    }
}
