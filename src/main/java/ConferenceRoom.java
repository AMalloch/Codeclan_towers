public class ConferenceRoom extends Room{

    private String roomType;

    public ConferenceRoom(RoomType roomType) {
        super(roomType.getCapacity());
        this.roomType = roomType.getType();
    }
}

