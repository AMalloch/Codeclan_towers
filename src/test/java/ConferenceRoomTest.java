import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Angus");
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE);
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void roomOccupied(){
        conferenceRoom.addGuest(guest);
        assertEquals(true, conferenceRoom.checkRoomOccupied());
    }
}
