import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> guests;
    private RoomType roomType;

    public Room (RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public ArrayList<Guest> getGuest() {
        return guests;
    }

    public int getRoomCapacity(){
        return this.roomType.getCapacity();
    }

    public boolean checkRoomOccupied() {
        if (this.guests.size() > 0) {
            return true;
        }return false;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public RoomType getRoomType(){
        return roomType;
    }
}
