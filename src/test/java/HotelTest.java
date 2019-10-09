import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel1;
    private Guest guest1;

    @Before
    public void before() {
        hotel1 = new Hotel(1);
        guest1 = new Guest("Steve");
    }

    @Test
    public void getCapacity() {
        assertEquals(1, hotel1.getCapacity());
    }

    @Test
    public void bedroomsHaveAvailability() {
        assertEquals(true, hotel1.bedroomsHaveAvailability());
    }

    @Test
    public void canAddGuestToRoom() {
        hotel1.addGuest(guest1);
        assertEquals(1, hotel1.guestCount());
    }

}
