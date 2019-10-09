import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom room1;
    private Bedroom room2;

    @Before
    public void before() {
        room1 = new Bedroom(1, 2, "Double");
        room2 = new Bedroom(2, 1, "Single");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, room1.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, room1.getCapacity());
    }

    @Test
    public void roomType() {
        assertEquals("Double", room1.getType());
        assertEquals("Single", room2.getType());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, room1.guestCount());
    }
}
