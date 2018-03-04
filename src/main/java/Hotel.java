import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
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

    public void addBedroomGuest(Guest guest, RoomType room){
        for (Bedroom bedroom : this.bedrooms){
            if (bedroom.getRoomType() == room && !bedroom.checkRoomOccupied()){
                bedroom.addGuest(guest);
            }
        }
    }

    public void addConferenceGuest(Guest guest, RoomType room){
        for (ConferenceRoom conferenceRoom : this.conferenceRooms){
            if (conferenceRoom.getRoomType() == room && !conferenceRoom.checkRoomOccupied()){
                conferenceRoom.addGuest(guest);
            }
        }
    }

    public void addDiningGuest(Guest guest, RoomType room){
        for (DiningRoom diningRoom : this.diningRooms){
            if (diningRoom.getRoomType() == room && !diningRoom.checkRoomOccupied()){
                diningRoom.addGuest(guest);
            }
        }
    }

    public void removeBedroomGuest(Guest guest, RoomType room) {
        for (Bedroom bedroom : this.bedrooms) {
            bedroom.removeGuest(guest);
        }
    }

    public void removeConferenceGuest (Guest guest, RoomType room){
        for (ConferenceRoom conferenceRoom : this.conferenceRooms){
            conferenceRoom.removeGuest(guest);
        }
    }

    public void removeDiningGuest (Guest guest, RoomType room){
        for (DiningRoom diningRoom : this.diningRooms){
            diningRoom.removeGuest(guest);
        }
    }

    public void checkBedroomOccupied (Guest guest, RoomType room){
        for (Bedroom bedroom : this.bedrooms){
            bedroom.checkRoomOccupied();
        }
    }

    public void checkDiningRoomOccupied (Guest guest, RoomType room){
        for (DiningRoom diningRoom : this.diningRooms){
            diningRoom.checkRoomOccupied();
        }
    }

    public void checkConferenceOccupied (Guest guest, RoomType room){
        for (ConferenceRoom conferenceRoom : this.conferenceRooms){
            conferenceRoom.checkRoomOccupied();
        }
    }

    public void checkCurrentGuestsBedroom (Guest guest, RoomType room){
        for (Bedroom bedroom : this.bedrooms){
            bedroom.getGuest();
        }
    }
}
