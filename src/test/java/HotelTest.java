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
    public void canAddBedroom() {
        bedr.addBedroom(bedroom);
        assertEquals(1, bedroom.countGuests());
    }

//   Ok confused myself give up, how can I make an instance of bedroom when I need to
//    add in a room type?! Think i'm doing the TDD wrong :(
}
