package entityList;

import entity.Room;
import java.util.ArrayList;

public class RoomList {

    // List to store all room objects
    private ArrayList<Room> rooms = new ArrayList<>();

    // Adds a new room to the list
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Displays all rooms in the list
    public void viewAllRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No room data available.");
            return;
        }
        int count = 1;
        for (Room r : rooms) {
            System.out.println("Room #" + count++);
            r.displayRoom();
        }
    }

    // Returns the entire list of rooms
    public ArrayList<Room> getAllRooms() {
        return rooms;
    }

    // Sets the room list (useful for loading saved data)
    public void setAllRooms(ArrayList<Room> list) {
        this.rooms = list;
    }
}
