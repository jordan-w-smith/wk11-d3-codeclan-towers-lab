import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel1;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Bedroom room1;
    private Bedroom room2;


    @Before
    public void before() {
        hotel1 = new Hotel(1);
        guest1 = new Guest("Steve");
        guest2 = new Guest("Johnson");
        guest3 = new Guest("Sarah");
        room1 = new Bedroom(1, 1, "Single");
        room2 = new Bedroom(2, 2, "Double");
    }

    @Test
    public void getCapacity() {
        assertEquals(1, hotel1.getCapacity());
    }

    @Test
    public void bedroomsHaveAvailability() {
        assertEquals(true, hotel1.bedroomsHaveAvailability());
    }

//    @Test
//    public void canAddGuestToHotel() {
//        hotel1.addGuest(guest1);
//        assertEquals(1, hotel1.guestCount());
//    }





}
