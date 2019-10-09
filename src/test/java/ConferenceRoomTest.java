import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom1;

    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom(30, "The Grand");
    }

    @Test
    public void hasCapacity() {
        assertEquals(30, conferenceRoom1.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("The Grand", conferenceRoom1.getName());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, conferenceRoom1.guestCount());
    }


}
