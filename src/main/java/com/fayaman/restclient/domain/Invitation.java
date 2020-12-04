package com.fayaman.restclient.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class Invitation implements Serializable {
    private static final long serialVersionUID = -295422703255886286L;
    private GuestDetails guestDetail;
    private String message;
    private LocalDate event_date;

    public Invitation() {
    }

    public Invitation(GuestDetails guestDetail, String message, LocalDate event_date, String event_title, boolean isRsvpRequired) {
        this.guestDetail = guestDetail;
        this.message = message;
        this.event_date = event_date;
        this.event_title = event_title;
        this.isRsvpRequired = isRsvpRequired;
    }

    public GuestDetails getguestDetail() {
        return guestDetail;
    }

    public void setguestDetail(GuestDetails guestDetail) {
        this.guestDetail = guestDetail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getEvent_date() {
        return event_date;
    }

    public void setEvent_date(LocalDate event_date) {
        this.event_date = event_date;
    }

    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public boolean isRsvpRequired() {
        return isRsvpRequired;
    }

    public void setRsvpRequired(boolean rsvpRequired) {
        isRsvpRequired = rsvpRequired;
    }

    private String event_title;
    private boolean isRsvpRequired;
    
}
