import org.junit.Before;

public class BedroomTest {

    Bedroom singleBedroom;
    Bedroom doubleBedroom;
    Bedroom familyBedroom;

    @Before
    public void before(){
        singleBedroom = new Bedroom(RoomType.SINGLE());
        doubleBedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), "Double Bedroom");
        familyBedroom = new Bedroom(RoomType.FAMILY.getCapacity(), "Family Bedroom");
    }

}
