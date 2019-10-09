import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private int capacity;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<Integer, String> bedroomTypes;
    private ArrayList<Guest> guests;
    private ArrayList<Booking> bookings;

    public Hotel(int capacity) {
        this.capacity = capacity;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bedroomTypes = new HashMap<Integer, String>();
        this.guests = new ArrayList<Guest>();
        this.bookings = new ArrayList<Booking>();
    }


    public int getCapacity() {
        return this.capacity;
    }


    public boolean bedroomsHaveAvailability() {
        return capacity > bedrooms.size();
    }

    public int countBookings() {
        return this.bookings.size();
    }

    public void addBooking(Booking bookingParameter) {
        this.bookings.add(bookingParameter);
    }



}
