import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.roomType;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guestParameter) {
        if (guestCount() < this.capacity) {
            this.guests.add(guestParameter);
        }
    }

    public void removeGuest(Guest guestParameter) {
        this.guests.remove(guestParameter);
    }


}
