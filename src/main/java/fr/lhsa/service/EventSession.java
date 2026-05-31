package fr.lhsa.service;

import fr.lhsa.model.Event;

public class EventSession {

    private static Event selectedEvent;

    public static Event getSelectedEvent() {
        return selectedEvent;
    }

    public static void setSelectedEvent(Event event) {
        selectedEvent = event;
    }
}