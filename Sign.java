public class Sign extends Item {
    private String message = "Welcome to the pitch! This is no ordinary field; it possesses magical properties that will challenge and amaze you.";

    public Sign(String name, String description, Coordinate position) {
        super(name, description, position);
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String use() {
        return "You read the sign: " + message;
    }
    
}
