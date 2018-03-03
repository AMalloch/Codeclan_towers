public class DiningRoom extends Room{
    private String roomType;
    private RoomSize roomSize;
    public DiningRoom(Integer capacity, String roomType) {
        super(capacity);
        this.roomType = roomType;
        this.roomSize = roomSize;
    }
}
