public class Bedroom extends Room{

    private String type;

    public Bedroom(RoomType roomType) {
        super(roomType.getCapacity());
        this.type = roomType.getType();
    }

    public String getType() {
        return type;
    }
}
