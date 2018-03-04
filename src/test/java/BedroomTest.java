import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom singleBedroom;
    Bedroom doubleBedroom;
    Bedroom familyBedroom;
    Guest guest;

    @Before
    public void before(){
        singleBedroom = new Bedroom(RoomType.SINGLE);
        doubleBedroom = new Bedroom(RoomType.DOUBLE);
        familyBedroom = new Bedroom(RoomType.FAMILY);
        guest = new Guest("Angus");
    }

    @Test
    public void canAddGuestSingleBedroom() {
        singleBedroom.addGuest(guest);
        assertEquals(1, singleBedroom.countGuests());
    }

    @Test
    public void canAddGuestDoubleBedroom() {
        doubleBedroom.addGuest(guest);
        assertEquals(1, doubleBedroom.countGuests());
    }

    @Test
    public void canAddGuestFamilyBedroom() {
        familyBedroom.addGuest(guest);
        assertEquals(1, familyBedroom.countGuests());
    }

    @Test
    public void canRemoveGuestSingleBedroom() {
        singleBedroom.addGuest(guest);
        singleBedroom.addGuest(guest);
        singleBedroom.removeGuest(guest);
        assertEquals(1, singleBedroom.countGuests());
    }

    @Test
    public void canRemoveGuestDoubleBedroom() {
        doubleBedroom.addGuest(guest);
        doubleBedroom.addGuest(guest);
        doubleBedroom.removeGuest(guest);
        assertEquals(1, doubleBedroom.countGuests());
    }

    @Test
    public void canRemoveGuestFamilyBedroom() {
        familyBedroom.addGuest(guest);
        familyBedroom.addGuest(guest);
        familyBedroom.removeGuest(guest);
        assertEquals(1, familyBedroom.countGuests());
    }

    @Test
    public void roomOccupiedSingleBedroom(){
        singleBedroom.addGuest(guest);
        assertEquals(true, singleBedroom.checkRoomOccupied());
    }

    @Test
    public void roomOccupiedDoubleBedroom(){
        doubleBedroom.addGuest(guest);
        assertEquals(true, doubleBedroom.checkRoomOccupied());
    }

    @Test
    public void roomOccupiedFamilyBedroom(){
        familyBedroom.addGuest(guest);
        assertEquals(true, familyBedroom.checkRoomOccupied());
    }

}
