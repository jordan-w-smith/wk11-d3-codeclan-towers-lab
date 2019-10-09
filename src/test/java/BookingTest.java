import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Bedroom room1;
    private Bedroom room2;
    private Booking booking1;


    @Before
    public void before() {
        room1 = new Bedroom(1, 1, "Single");
        room2 = new Bedroom(2, 1, "Single");
        booking1 = new Booking(5);
    }

    @Test
    public void bookingHasRoom() {
        booking1.addRoom(room1);
        booking1.addRoom(room2);
        assertEquals(2, booking1.roomCount());
    }

    @Test
    public void hasNightsBooked() {
        assertEquals(5, booking1.getNightsBooked());
    }

}
