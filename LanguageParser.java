public class LanguageParser {

    public LanguageParser() {
        // Constructor can be empty or used for initialization if needed
    }
    
    public Command parse(String userInput) {
        userInput = userInput.trim().toLowerCase();

        if (userInput.startsWith("go ")) {
            return new Command(CommandType.GO, userInput.substring(3));
        } else if (userInput.startsWith("look ")) {
            return new Command(CommandType.LOOK, userInput.substring(5));
        } else if (userInput.startsWith("use ")) {
            return new Command(CommandType.USE, userInput.substring(4));
        } else if (userInput.startsWith("kick ")) {
            return new Command(CommandType.KICK, userInput.substring(5));
        } else if (userInput.startsWith("turn on light") || userInput.startsWith("turn light on")) {
            return new Command(CommandType.LIGHT, "");
        } else if (userInput.startsWith("walk through")){
            return new Command(CommandType.WALK, "");
        }

        return new Command(CommandType.UNKNOWN, userInput);
    }
}
