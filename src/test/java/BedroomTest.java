import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom room1;
    private Bedroom room2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before() {
        room1 = new Bedroom(1, 1, "Single");
        room2 = new Bedroom(2, 2, "Double");
        guest1 = new Guest("Steve");
        guest2 = new Guest("Johnson");
        guest3 = new Guest("Sarah");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, room1.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, room1.getCapacity());
    }

    @Test
    public void roomType() {
        assertEquals("Single", room1.getType());
        assertEquals("Double", room2.getType());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, room1.guestCount());
    }

    @Test
    public void canAddGuestToRoom() {
        room1.addGuest(guest1);
        room1.addGuest(guest2);
        room2.addGuest(guest3);

        assertEquals(1, room1.guestCount());
        assertEquals(1, room2.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        room2.addGuest(guest1);
        room2.addGuest(guest2);
        room2.removeGuest(guest1);
        assertEquals(1, room2.guestCount());
    }
}
