package ru.netology.TicketManager;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String flight;
    private String arrivals;
    private int time;

    public Ticket() {

    }

    public Ticket(int id, int price, String flight, String arrivals, int time) {
        this.id = id;
        this.price = price;
        this.flight = flight;
        this.arrivals = arrivals;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getArrivals() {
        return arrivals;
    }

    public void setArrivals(String arrivals) {
        this.arrivals = arrivals;
    }

    @Override
    public int compareTo(Ticket otherTickets) {
        if (price < otherTickets.price) {
            return -1;
        }
        if (price > otherTickets.price) {
            return 1;
        }
        return 0;
    }

}
