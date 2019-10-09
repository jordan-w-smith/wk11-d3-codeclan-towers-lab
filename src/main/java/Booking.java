import java.util.ArrayList;

public class Booking {
    private Booking booking;
    private ArrayList<Bedroom> rooms;
    private int nightsBooked;

    public Booking(int nightsBooked) {
        this.rooms = new ArrayList<Bedroom>();
        this.nightsBooked = nightsBooked;
    }

    public int roomCount() {
        return this.rooms.size();
    }

    public void addRoom(Bedroom roomParameter) {
        this.rooms.add(roomParameter);
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }
}
