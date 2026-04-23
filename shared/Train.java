package shared;

public class Train {
    private String id;
    private String origin;
    private String destination;

    // Constructor
    public Trai(String id, String origin, String destination) {
        this.id = id;
        this.origin = origin;
        this.desstination = destination;
    }

    // Getter
    public String getID() {
        return id;
    }git remote -v

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    // Optional: Setter (kalau mau fleksibel
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    // To