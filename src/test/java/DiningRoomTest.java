import org.junit.Before;

public class DiningRoomTest {

    DiningRoom thorntonDining;
    DiningRoom malveyDining;

    @Before
    public void before() {
        thorntonDining = new DiningRoom(RoomType.THORNTONDINING);
        malveyDining = new DiningRoom(RoomType.MALVEYDINING);
    }

}
