public enum RoomType {
    SINGLE(1, "Single Bedroom"),
    DOUBLE(2, "Double Bedroom"),
    FAMILY(4, "Family Bedroom"),
    THORNTONDINING(200, "Thornton Restaurant"),
    MALVEYDINING(300, "Malvey Restaurant");

    private int capacity;
    private String type;

    RoomType(int capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }
}
