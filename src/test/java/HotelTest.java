import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Guest guest;
    ConferenceRoom conferenceRoom;
    DiningRoom thorntonDining;
    DiningRoom malveyDining;
    Bedroom singleBedroom;
    Bedroom doubleBedroom;
    Bedroom familyBedroom;

    @Before
    public void before() {
        guest = new Guest("Angus");
        singleBedroom = new Bedroom(RoomType.SINGLE);
        doubleBedroom = new Bedroom(RoomType.DOUBLE);
        familyBedroom = new Bedroom(RoomType.FAMILY);
        thorntonDining = new DiningRoom(RoomType.THORNTONDINING);
        malveyDining = new DiningRoom((RoomType.MALVEYDINING));
        conferenceRoom = new ConferenceRoom((RoomType.CONFERENCE));
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(conferenceRoom);
        assertEquals(1, conferenceRoom.countGuests());
    }
}
