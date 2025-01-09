package vttp_batchb_paf.day21.model;

public class Room {
    private int id;
    private String roomtype;
    private float price;
    
    public Room() {
    }

    public Room(int id, String roomtype, float price) {
        this.id = id;
        this.roomtype = roomtype;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRoomtype() {
        return roomtype;
    }
    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
