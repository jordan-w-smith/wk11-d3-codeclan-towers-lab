import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private int capacity;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<Integer, String> bedroomTypes;
    private ArrayList<Guest> guests;

    public Hotel(int capacity) {
        this.capacity = capacity;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bedroomTypes = new HashMap<Integer, String>();
        this.guests = new ArrayList<Guest>();
    }


    public int getCapacity() {
        return this.capacity;
    }


    public boolean bedroomsHaveAvailability() {
        return capacity > bedrooms.size();
    }

    public int guestCount() {
        return this.guests.size();
    }

//    public void addGuest(Guest guest1) {
//        if (bedroomsHaveAvailability()) {
//            this.guests.add(guest1);
//        }
//    }
}
