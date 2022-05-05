package com.example.tema1.model;

/**
 * The type Event factory.
 */
public class EventFactory {

    /**
     * Create event event.
     * cream instante de filme si spectacole pe care le vom folosi pentru a le insera in baza de date
     * @param eventType the event type
     * @return the event
     */
    public Event createEvent(EventType eventType){
        if(eventType.equals(EventType.FILM)){
            return new Film("Aftermath10", "horror", 15, "simplu", "12:15 06-04-2020 Mi", 34, 18, "Peter Winther",
                    "Ashley Greene, Shawn Ashmo, Jason Liles");
        }
        if(eventType.equals(EventType.SPECTACOL)){
            return new Spectacol("Aievea10", "populara", "09-12-2021", "Bucuresti", "Andra", "20-22");
        }
        return null;
    }
}
