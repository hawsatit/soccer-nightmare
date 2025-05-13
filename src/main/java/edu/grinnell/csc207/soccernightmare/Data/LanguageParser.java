package edu.grinnell.csc207.soccernightmare.Data;

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
        } else if (userInput.startsWith("walk through")) {
            return new Command(CommandType.WALK, "");
        } else if (userInput.startsWith("open curtain")) {
            return new Command(CommandType.OPEN_CURTAIN, "");
        } else if (userInput.equals("hint")) {
            System.out.println("Here are some commands you can do (This does not contain all commands):"
                    + "\n Go <cardinal directions>"
                    + "\n Look <cardinal directions>"
                    + "\n Use <item>");
            return new Command(CommandType.HINT, "");
        }

        return new Command(CommandType.UNKNOWN, userInput);
    }
}
