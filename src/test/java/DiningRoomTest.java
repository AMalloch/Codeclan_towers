import org.junit.Before;

public class DiningRoomTest {

    DiningRoom thorntonDining;
    DiningRoom malveyDining;

    @Before
    public void before() {
        thorntonDining = new DiningRoom(RoomSize.THORNTONDINING.getRoomSize(), "Thornton Restaurant");
        malveyDining = new DiningRoom(RoomSize.MALVEYDINING.getRoomSize(), "Malvey Restaurant");
    }

}
