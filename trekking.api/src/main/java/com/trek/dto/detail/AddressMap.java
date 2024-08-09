package com.trek.dto.detail;

public class AddressMap {

    private String title;
    private String locationURL;
    private String name;
    private String state;
    private int pin;
    private String country;

    public AddressMap() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AddressMap(String title, String locationURL, String name, String state, int pin, String country) {
        super();
        this.title = title;
        this.locationURL = locationURL;
        this.name = name;
        this.state = state;
        this.pin = pin;
        this.country = country;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationURL() {
        return locationURL;
    }

    public void setLocationURL(String locationURL) {
        this.locationURL = locationURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
