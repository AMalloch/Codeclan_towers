import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    Guest guest;
    DiningRoom thorntonDining;
    DiningRoom malveyDining;

    @Before
    public void before() {
        guest = new Guest("Angus");
        thorntonDining = new DiningRoom(RoomType.THORNTONDINING);
        malveyDining = new DiningRoom(RoomType.MALVEYDINING);
    }

    @Test
    public void canAddGuestThornton() {
        thorntonDining.addGuest(guest);
        assertEquals(1, thorntonDining.countGuests());
    }

    @Test
    public void canAddGuestMalvey() {
        malveyDining.addGuest(guest);
        assertEquals(1, malveyDining.countGuests());
    }

    @Test
    public void canRemoveGuestThornton() {
        thorntonDining.addGuest(guest);
        thorntonDining.addGuest(guest);
        thorntonDining.removeGuest(guest);
        assertEquals(1, thorntonDining.countGuests());
    }

    @Test
    public void canRemoveGuestMalvey() {
        malveyDining.addGuest(guest);
        malveyDining.addGuest(guest);
        malveyDining.removeGuest(guest);
        assertEquals(1, malveyDining.countGuests());
    }

    @Test
    public void roomOccupiedThornton(){
        thorntonDining.addGuest(guest);
        assertEquals(true, thorntonDining.checkRoomOccupied());
    }

    @Test
    public void roomOccupiedMalvey(){
        malveyDining.addGuest(guest);
        assertEquals(true, malveyDining.checkRoomOccupied());
    }

}
