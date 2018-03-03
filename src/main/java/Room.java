import java.util.ArrayList;

public abstract class Room {
    private Integer capacity;
    private ArrayList<Guest> guests;

    public Room (Integer capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getRoomCapacity(){
        return this.capacity;
    }

    public void addGuest(Guest guest){
        if(getRoomCapacity() < this.capacity){
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }
}
