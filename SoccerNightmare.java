import java.util.Scanner;

public class SoccerNightmare {
    public static void main(String[] args) {
        // Create a new Person object
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        /**
        * This function prompts the user for valid string input and reprompts until
        * it is gotten
        *
        * @param scanner
        * @param prompt
        * @return
        */
        Boolean playing = true;
        Room currentRoom = new Bedroom();
        LanguageParser languageParser = new LanguageParser();

        while (playing) {
            System.out.println("You wake up in a room. You feel extremely dissy and dehydrated. You don't know who you are or where you are. \n The room is dark and you can't see anything, but you can feel a lamp next to you. \n use 'help' whenever");
            String userInput = getValidString(scanner, counter + " =====================");
            Command command = languageParser.parse(userInput);
            currentRoom = currentRoom.performCommand(command);
            if (currentRoom == null) {
                System.out.println("You have died. Game over.");
                playing = false;
            }
            counter++;
        }

    }

    public static String getValidString(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input.matches("[a-zA-Z\\s]+")) { // Example validation: only letters and spaces
                return input;
            } else {
                System.out.println("Invalid input. Please enter a valid name (letters and spaces only).");
            }
        }
    }

}
