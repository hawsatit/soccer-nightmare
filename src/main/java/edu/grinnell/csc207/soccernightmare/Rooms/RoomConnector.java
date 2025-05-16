package edu.grinnell.csc207.soccernightmare.Rooms;

/**
 * This class is used to connect the rooms together.
 */
public class RoomConnector {
    public static Bedroom bedroom;
    public static LivingRoom livingRoom;
    public static PracticePitch practicePitch;

    public static void connectRooms() {
        bedroom = new Bedroom();
        livingRoom = new LivingRoom();
        practicePitch = new PracticePitch();

        // Manually set nextRoom or connections
        bedroom.setNextRoom(livingRoom);
        livingRoom.setPrevRoom(bedroom); // or set back to Bedroom if bidirectional
        livingRoom.setNextRoom(practicePitch);
        practicePitch.setPrevRoom(livingRoom); // or set back to LivingRoom if bidirectional
        practicePitch.setNextRoom(null); // or set back to LivingRoom if bidirectional
    }
}
