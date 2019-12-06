package com.example.bta.modals;

public class Bus {
    protected String destination;
    protected String from;

    public Bus(String destination, String from) {
        this.destination = destination;
        this.from = from;
    }

    public String getDestination() {
        return "Destination: "+destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFrom() {
        return "Bus Stop: "+from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
