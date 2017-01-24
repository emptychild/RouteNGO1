package com.example.routengo1.model;

import java.util.List;

/**
 * Created by megaman on 24.01.2017.
 */

public class EventUnit extends Unit{
    private List<Event> eventList;

    public EventUnit(String title, String description, List<Event> eventList) {
        super(title, description);
        this.eventList = eventList;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
