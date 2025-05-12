public class Command {
    private CommandType type;
    private String argument;

    public Command(CommandType type, String argument) {
        this.type = type;
        this.argument = argument;
    }

    public CommandType getType() {
        return type;
    }

    public String getArgument() {
        return argument;
    }
}
