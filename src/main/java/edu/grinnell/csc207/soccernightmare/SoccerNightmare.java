package edu.grinnell.csc207.soccernightmare;
import edu.grinnell.csc207.soccernightmare.Data.Command;
import edu.grinnell.csc207.soccernightmare.Data.LanguageParser;
import edu.grinnell.csc207.soccernightmare.Items.BedroomWindow;
import edu.grinnell.csc207.soccernightmare.Items.Waterbottle;
import edu.grinnell.csc207.soccernightmare.Rooms.Bedroom;
import edu.grinnell.csc207.soccernightmare.Rooms.Room;

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

        System.out.println("You wake up in a room. You feel extremely dizzy and dehydrated. You don't know who you are or where you are." +
            " \n The room is dark and you can't see anything, but you can feel a lamp next to you. \n use 'hint' whenever");

        while (playing) {
            String userInput = getValidString(scanner, counter + " =====================");
            Command command = languageParser.parse(userInput);
            currentRoom = currentRoom != null ? currentRoom.performCommand(command) : null;

            if (currentRoom == null) {
                System.out.println("Game over.");
                playing = false;
                continue;
            }

            if (currentRoom.getName().equals("Bedroom")) {
                if (counter >= 6) {
                    Bedroom bedroom = (Bedroom) currentRoom;
                    Waterbottle waterbottle = (Waterbottle) bedroom.getItems().get(0);
                    if (waterbottle.getWaterAmount() >= 3) {
                        System.out.println("You die from dehydration.");
                        playing = false;
                    }
                }
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
