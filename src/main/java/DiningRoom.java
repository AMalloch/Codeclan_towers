public class DiningRoom extends Room{

    private String roomType;

    public DiningRoom(RoomType roomType) {
        super(roomType.getCapacity());
        this.roomType = roomType.getType();
    }
}
