package entity;

public class Room {

    // Properties of the room
    private int seat;
    private String table;
    private String chair;
    private String bed;
    private String fanlight;

    // Default constructor
    public Room() {
    }

    // Parameterized constructor to initialize all room properties
    public Room(int seat, String table, String chair, String bed, String fanlight) {
        this.seat = seat;
        this.table = table;
        this.chair = chair;
        this.bed = bed;
        this.fanlight = fanlight;
    }

    // Getter and Setter for seat
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    // Getter and Setter for table
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    // Getter and Setter for chair
    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    // Getter and Setter for bed
    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    // Getter and Setter for fanlight
    public String getFanlight() {
        return fanlight;
    }

    public void setFanlight(String fanlight) {
        this.fanlight = fanlight;
    }

    // Method to display room information
    public void displayRoom() {
        System.out.println("-----------------------------------");
        System.out.println("Seats(Room no.): " + seat);
        System.out.println("Table          : " + table);
        System.out.println("Chair          : " + chair);
        System.out.println("Bed            : " + bed);
        System.out.println("Fan/Light      : " + fanlight);
        System.out.println("-----------------------------------\n");
    }
}
