public class Persoon {
    private String name;
    private Boolean ticket;
    private Integer classs;
    private String destination;

    public Persoon(String name, Boolean ticket, Integer classs, String destination) {
        this.name = name;
        this.ticket = ticket;
        this.classs = classs;
        this.destination = destination;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getTicket() {
        return this.ticket;
    }

    public Integer getClasss() {
        return this.classs;
    }

    public String getDestination() {
        return this.destination;
    }
}
