import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms =  new ArrayList<>();
        this.conferenceRooms =  new ArrayList<>();
        this.diningRooms =  new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.add(diningRoom);
    }
}
