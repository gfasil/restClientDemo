package com.fayaman.restclient.domain;

import java.io.Serializable;

public class GuestDetails implements Serializable {
    private static final long serialVersionUID = -295422703255886288L;
    private String name;
    private String address;
    private String phone_number;

    public GuestDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
